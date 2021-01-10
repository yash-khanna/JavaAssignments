import java.util.Scanner;
class FirstProgram{
        public static void main (String args[])
        {
                Scanner s = new Scanner(System.in);
                double const_length = s.nextDouble();
                double const_width = s.nextDouble();
                double plot_length = s.nextDouble();
                double plot_width = s.nextDouble();
                String str = "\"HelloWorld\"";
                System.out.println(str);
                long l = 0x99ffL;
                System.out.println(calculateArea(const_length, const_width, plot_length, plot_width));
                System.out.println("Hello kaise ho, sabko jai mata di.");
        }

        public static double calculateArea(double const_length,double const_width,double plot_length,double plot_width)
        {
                return plot_width*plot_length - const_width*const_length;
        }
}