package tester;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.cash_book.model.CashBookDAO;
import com.cash_book.model.GetableAttributeNamesDTO;
import com.cash_book.model.dateList.DateListDTO;
import com.cash_book.model.dbConnection.DBConnection;
import com.cash_book.model.income.IncomeDTO;
import com.cash_book.model.member.MemberDTO;
import com.cash_book.model.outcome.OutcomeDTO;

public class DAO_SELECT_test {
	public static void main(String[] args) {
		CashBookDAO dao = new CashBookDAO(DBConnection.getConnection());
		
		
		// MemberDTO Test
		System.out.println("\n\n*** MemberDTO Test ***");
		
		GetableAttributeNamesDTO memberDTO = new MemberDTO("01095513439", "CHOCOBE", "COFFEE");		
		
		List<GetableAttributeNamesDTO> memberResult = dao.select(memberDTO);
		Iterator<GetableAttributeNamesDTO> iteratorMemberDTO = memberResult.iterator();
		
		while(iteratorMemberDTO.hasNext()) {
			GetableAttributeNamesDTO currentDTO = iteratorMemberDTO.next();
			Map<String, String> currentValues = currentDTO.getAttributeValues();

			currentValues.forEach((key, value) -> {
				System.out.println("[MemberDTO] : <" + key + ", " + value + ">");
			});
			System.out.println();
		}

		
		// DateListDTO Test
		System.out.println("\n\n*** DateListDTO Test ***");
		
		GetableAttributeNamesDTO dateListDTO = new DateListDTO("01095513438", "20191005");
		List<GetableAttributeNamesDTO> dateListResult = dao.select(dateListDTO);
		Iterator<GetableAttributeNamesDTO> iteratorDateListDTO = dateListResult.iterator();
		
		while(iteratorDateListDTO.hasNext()) {
			GetableAttributeNamesDTO currentDTO = iteratorDateListDTO.next();
			Map<String, String> currentValues = currentDTO.getAttributeValues();
			
			currentValues.forEach((key, value) -> {
				System.out.println("[DateListDTO] : <" + key + ", " + value + ">");
			});
			System.out.println();
		}
		
		// IncomeDTO Test
		System.out.println("\n\n*** IncomeDTO Test ***");
		
		GetableAttributeNamesDTO incomeDTO = new IncomeDTO("01095513439", 
														   "20191005", 
														   null, 
														   null ,
														   null);
		List<GetableAttributeNamesDTO> incomeResult = dao.select(incomeDTO);
		Iterator<GetableAttributeNamesDTO> iteratorIncomeDTO = incomeResult.iterator();
		
		while(iteratorIncomeDTO.hasNext()) {
			GetableAttributeNamesDTO currentDTO = iteratorIncomeDTO.next();
			Map<String, String> currentValues = currentDTO.getAttributeValues();
			
			currentValues.forEach((key, value) -> {
				System.out.println("[IncomeDTO] : <" + key + ", " + value + ">");
			});
			System.out.println();
		}
		
		
		// OutcomeDTO Test
		System.out.println("\n\n*** OutcomeDTO Test ***");
		
		GetableAttributeNamesDTO outcomeDTO = new OutcomeDTO("01095513439", 
															 "20191005", 
															 null, 
															 null, 
															 null);
		List<GetableAttributeNamesDTO> outcomeResult = dao.select(outcomeDTO);
		Iterator<GetableAttributeNamesDTO> iteratorOutcomeDTO = outcomeResult.iterator();
		
		while(iteratorOutcomeDTO.hasNext()) {
			GetableAttributeNamesDTO currentDTO = iteratorOutcomeDTO.next();
			Map<String, String> currentValues = currentDTO.getAttributeValues();
			
			currentValues.forEach((key, value) -> {
				System.out.println("[OutcomeDTO] : <" + key + ", " + value + ">");
			});
			System.out.println();
		}
	}
}
