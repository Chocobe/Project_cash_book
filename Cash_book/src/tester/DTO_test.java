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

public class DTO_test {
	public static void main(String[] args) {
		CashBookDAO dao = new CashBookDAO(DBConnection.getConnection());

		// MemberDTO Test
		System.out.println("\n\n*** MemberDTO Test ***");
		
		GetableAttributeNamesDTO memberDTO = new MemberDTO("", "CHOCOBE", "");
		List<GetableAttributeNamesDTO> memberResult = dao.select(memberDTO);
		Iterator<GetableAttributeNamesDTO> iteratorMemberDTO = memberResult.iterator();
		while(iteratorMemberDTO.hasNext()) {
			GetableAttributeNamesDTO currentDTO = iteratorMemberDTO.next();
			Map<String, String> currentValues = currentDTO.getAttributeValues();

			currentValues.forEach((key, value) -> {
				System.out.println("[MemberDTO] : <" + key + ", " + value + ">");
			});
		}

		
		// DateListDTO Test
		System.out.println("\n\n*** DateListDTO Test ***");
		
		GetableAttributeNamesDTO dateListDTO = new DateListDTO("01095513439", "20191005");
		List<GetableAttributeNamesDTO> dateListResult = dao.select(dateListDTO);
		Iterator<GetableAttributeNamesDTO> iteratorDateListDTO = dateListResult.iterator();
		while(iteratorDateListDTO.hasNext()) {
			GetableAttributeNamesDTO currentDTO = iteratorDateListDTO.next();
			Map<String, String> currentValues = currentDTO.getAttributeValues();
			
			currentValues.forEach((key, value) -> {
				System.out.println("[DateListDTO] : <" + key + ", " + value + ">");
			});
		}
		
		// IncomeDTO Test
		System.out.println("\n\n*** IncomeDTO Test ***");
		
		
		
		// OutcomeDTO Test		
	}
}
