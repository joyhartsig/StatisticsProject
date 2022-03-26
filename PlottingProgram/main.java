import java.io.IOException;

public class main
{
    public static void main(String arg[]) throws IOException
    {
        Plotter p = new Plotter();
        p.plotter();
        
        Salter s = new Salter();
        s.salter();
        
        Smoother m = new Smoother();
        m.smoother();
    }
    }