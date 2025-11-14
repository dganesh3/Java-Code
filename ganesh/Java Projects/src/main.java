
public class main {
static void perc(int p,int c, int m,int o)
{
int total=p+c+m+o;
float perc = (total/400.0f)*100;
System.out.println(perc);
}
public main() {
	perc(50,23,67,97);
}
}

