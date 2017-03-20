import javax.swing.*;
import java.awt.FlowLayout;

public class Task0 extends java.util.TimerTask


{
private long targ;
private JFrame test = new JFrame();
private JLabel countdown = new JLabel("");
private java.util.Timer timer;


Task0(java.util.Timer timer)throws java.lang.Exception
{
this.timer = timer;
test.setVisible(true);
test.setBounds (250,250,400,75);
test.setLayout (new FlowLayout());
test.add(countdown);
reset();
}

public void run()
{
int n = (int)((this.targ - System.currentTimeMillis())/(1000L));
int hoursLeft = (n/3600);
int minutesLeft = (n/60)-(hoursLeft*60);
int secondsLeft = (n)-((minutesLeft*60)+(hoursLeft*60*60));
countdown.setText(hoursLeft + " hours, " + minutesLeft + " minutes, " + secondsLeft + " seconds left.");

}

void reset() throws java.lang.Exception
{
long days = 10 + Math.round(Math.random());
long hours = Math.round(Math.random()*1);
long minutes = Math.round(Math.random()*1);
long seconds = Math.round(Math.random()*1);
String str = "2011-08-" + days +"-"+ hours + "-" +minutes+"-"+seconds;//date-time with the pattern "yyyy-MM-dd-HH-mm-ss"

java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
java.util.Date date = formatter.parse(str);
long target = date.getTime();//target date-time in Milliseconds
}


} 