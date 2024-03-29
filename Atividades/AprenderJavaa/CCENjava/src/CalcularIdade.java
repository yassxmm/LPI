
import java.util.Calendar;
import java.util.Date;

public class CalcularIdade {
    public static int calcular(Date data){
        Calendar datanasc = Calendar.getInstance();
        datanasc.setTime(data);
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        int i = hoje.get(Calendar.YEAR) - datanasc.get(Calendar.YEAR);
        datanasc.add(Calendar.YEAR, i);
        if (hoje.before(datanasc)) {
            i--;
        }
        return i;
    }
    
}
