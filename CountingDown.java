import javax.swing.*;
import java.awt.FlowLayout;

public class CountingDown
{

public static void main(String[] args) throws java.lang.Exception
{
java.util.Timer timer = new java.util.Timer();
Task0 task = new Task0(timer);
timer.schedule(task, 0L, 10L);
}

}