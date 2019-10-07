package tester;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.cash_book.model.CashBookDAO;
import com.cash_book.model.GetableAttributeNamesDTO;
import com.cash_book.model.dateList.DateListDTO;
import com.cash_book.model.dbConnection.DBConnection;
import com.cash_book.model.member.MemberDTO;
import com.cash_book.model.outcome.OutcomeDTO;

public class DAO_TupleCount_test {
	public static void main(String[] args) {
		CashBookDAO dao = new CashBookDAO(DBConnection.getConnection());
		
		GetableAttributeNamesDTO memberDTO = new MemberDTO("01095513439", "", "");
		System.out.println(dao.getTupleCount(memberDTO));
		

		GetableAttributeNamesDTO dateListDTO = new DateListDTO("01095513439", "");
		System.out.println(dao.getTupleCount(dateListDTO));
		
		
		GetableAttributeNamesDTO outcomeDTO = new OutcomeDTO("01095513439", 
															 null, 
															 null, 
															 null, 
															 null, 
															 null);
		System.out.println(dao.getTupleCount(outcomeDTO));
		
		List<GetableAttributeNamesDTO> outcomeResult = dao.select(outcomeDTO);
		Iterator<GetableAttributeNamesDTO> outcomeIterator = outcomeResult.iterator();
		while(outcomeIterator.hasNext()) {
			GetableAttributeNamesDTO currentDTO = outcomeIterator.next();
			Map<String, String> currentValues = currentDTO.getAttributeValues();
			
			currentValues.forEach((key, value) -> {
				System.out.println("OutcomeDTO] <" + key + ", " + value + ">");
			});				
		}
	}
}
