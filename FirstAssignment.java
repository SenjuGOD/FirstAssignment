/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Your name
 *	@since	Today's date
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	s1.setFont(f);
    	add(s1);
    	    	
    	//	Continue adding lines until you have 12 to 15 lines
    	GLabel s2 = new GLabel("For the first 1 and a half months of summer, all my friends were still in the neighborhood.", 10, 40);
    	s2.setFont(f);
    	add(s2);
    	GLabel s3 = new GLabel("So, the first two weeks was super fun, we used to go out at 11 in the morning to play ", 10, 60);
    	s3.setFont(f);
    	add(s3);
    	GLabel s4 = new GLabel("and this was in the public spaces of the neighborhood, so after 1 or 2 hours we go back", 10, 80);
    	s4.setFont(f);
    	add(s4);
    	GLabel s5 = new GLabel("to our houses. In the few hours until 5 in the afternoon, I used to study whatever courses", 10, 100);
    	s5.setFont(f);
    	add(s5);
    	GLabel s6 = new GLabel("I had taken for the next year. Like maths, science and especially programming. After studying", 10, 120);
    	s6.setFont(f);
    	add(s6);
    	GLabel s7 = new GLabel("for a while, I would take a break and that's when my friends would call me out for soccer. Only", 10, 140);
    	s7.setFont(f);
    	add(s7);
    	GLabel s8 = new GLabel("only then would I realize it already 5. Once I went out again I would only come back at 8:30 or", 10, 160);
    	s8.setFont(f);
    	add(s8);
    	GLabel s9 = new GLabel("9pm. Once I came back I would be almost dead. But still have enough energy to eat dinner and", 10, 180);
    	s9.setFont(f);
    	add(s9);
    	GLabel s10 = new GLabel("watch TV or play video games before sleeping at 10:30 or 11pm. This was my usual day for", 10, 200);
    	s10.setFont(f);
    	add(s10);
    	GLabel s11 = new GLabel("the first 1 and a half months. Then for the last 2 weeks, lets say things were very interesting.", 10, 220);
    	s11.setFont(f);
    	add(s11);
    	GLabel s12 = new GLabel("We took a flight to reach the state Montanna, reached, rented a car, went to our hotel.", 10, 240);
    	s12.setFont(f);
    	add(s12);
    	GLabel s13 = new GLabel("At this moment my sister had a slight pain in her thighs. After 2 days of our adventure", 10, 260);
    	s13.setFont(f);
    	add(s13);
    	GLabel s14 = new GLabel("my sister had immense pain in her thighs. This happend suddenly one morning as we were", 10, 280);
    	s14.setFont(f);
    	add(s14);
    	GLabel s15 = new GLabel("eating breakfest. She tried to get up but instantly as she got up she sat down and started", 10, 300);
    	s15.setFont(f);
    	add(s15);
    	GLabel s16 = new GLabel("crying in pain. We instantly went to the nearest emercengy station, which was lucky because", 10, 320);
    	s16.setFont(f);
    	add(s16);
    	GLabel s17 = new GLabel("we were in the middle of nowhere. After 2 days of checking her leg, we got to know it was in", 10, 340);
    	s17.setFont(f);
    	add(s17);
    	GLabel s18 = new GLabel("the hips, more excatly, it was the femur. It lookes liked she had a fracture, called SCFE.", 10, 360);
    	s18.setFont(f);
    	add(s18);
    	GLabel s19 = new GLabel("So, our 2 week trip ended early and we came back on the 4th day. So for the rest of the", 10, 380);
    	s19.setFont(f);
    	add(s19);
    	GLabel s20 = new GLabel("the 1 and a half weeks of summer, I stayed inside the house and studied, played games and", 10, 400);
    	s20.setFont(f);
    	add(s20);
    	GLabel s21 = new GLabel("board games with my sister. That's all for my summer! A good, normal and happy one!", 10, 420);
    	s21.setFont(f);
    	add(s21);
    	
    }
    
}
