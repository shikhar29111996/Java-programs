package Inheritence.distance;

import java.io.*;

class d3point extends d2point
{
    double z;
    
    d3point()
    {
        z=0;
    }
    
    d3point(double nz)
    {
        z=nz;
    }
    
    public double distance2(d3point b)
    {
        return (Math.sqrt(((x-b.x)*(x-b.x))+((y-b.y)*(y-b.y))+((z-b.z)*(z-b.z))));
    }
}
