package dataHora;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// Como converter data hora de um OffSet para outro
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		OffsetDateTime date = OffsetDateTime.of(2020, 1, 15, 12, 20, 25, 0, ZoneOffset.of("+02:00"));
		
		OffsetDateTime date1 = date.withOffsetSameInstant(ZoneOffset.of("-03:00"));
		
		System.out.println(date.format(formatter));
		System.out.println(date1.format(formatter));
		
		// Como converter data hora local para um ZondeId específico
		ZonedDateTime ldt = ZonedDateTime.now();
		System.out.println("\n=================================");
		ZonedDateTime parisDateTime = ldt.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("São " + formatter.format(parisDateTime) + " em paris");

	}

}
