package Inheritence.distance;

import java.io.*;

class d2point
{
    double x,y;
    
    d2point()
    {
        x=0;
        y=0;
    }
    
    d2point(double nx,double ny)
    {
        x=nx;
        y=ny;
    }
    
    public double distance2(d2point b)
    {
        return (Math.sqrt(((x-b.x)*(x-b.x))+(y-b.y)*(y-b.y)));
    }
}
