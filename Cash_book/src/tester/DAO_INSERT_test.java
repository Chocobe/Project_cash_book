package tester;

import com.cash_book.model.AbstractDAO;
import com.cash_book.model.CashBookDAO;
import com.cash_book.model.GetableAttributeNamesDTO;
import com.cash_book.model.dateList.DateListDTO;
import com.cash_book.model.dbConnection.DBConnection;
import com.cash_book.model.income.IncomeDTO;
import com.cash_book.model.member.MemberDTO;
import com.cash_book.model.outcome.OutcomeDTO;

public class DAO_INSERT_test {
	public static void main(String[] args) {
		AbstractDAO dao = new CashBookDAO(DBConnection.getConnection());
		boolean result = false;
		
		// INSERT at MEMBER table test
		GetableAttributeNamesDTO memberDTO = new MemberDTO("01095513438", "CHOCO", "tiger");
		result = dao.insert(memberDTO);
		printResult(result);
		
		
		// INSERT at DATELIST table test
		GetableAttributeNamesDTO dateListDTO = new DateListDTO("01095513438", "20191008");
		result = dao.insert(dateListDTO);
		printResult(result);
		
		
		// INSERT at INCOME table test
		GetableAttributeNamesDTO incomeDTO = new IncomeDTO("01095513438", 
														   "20191008", 
														   null, 
														   "10000", 
														   "테스트_메모_1");
		result = dao.insert(incomeDTO);
		printResult(result);
		
		
		// INSERT at OUTCOME table test
		GetableAttributeNamesDTO outcomeDTO = new OutcomeDTO("01095513438",
															 "20191008",
															 "outcome테스트_1",
															 "5000",
															 null);
		result = dao.insert(outcomeDTO);
		printResult(result);
	}
	
	
	
	
	public static void printResult(boolean _result) {
		if(_result) {
			System.out.println("MEMBER 추가 성공");
			
		} else {
			System.out.println("MEMBER 추가 실패");
		}
		System.out.println("--------------------------------------------------");
	}
}
