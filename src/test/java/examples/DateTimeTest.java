package examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.runner.RunWith;

@RunWith(JQF.class)
public class DateTimeTest{
	
	@Fuzz
	public void testSimpleDateFormat(String format){
		DateFormat df = new SimpleDateFormat(format);
		df.format(new Date());
	}

	@Fuzz
	public void testDateTimeFormatterBuilder(String input){
		DateTimeFormatter.ofPattern(input);
	}

}
