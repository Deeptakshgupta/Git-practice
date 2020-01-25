package pulkit;

import java.applet.Applet;
import java.awt.*;

public class form extends Applet {
public void init() {
	//rame f=new Frame("Admission form");
	Label l=new Label("Admission Form");
	l.setBounds(380,5,100,25);
	add(l);
	Label id=new Label("Id ---");
	id.setBounds(220,35,25,25);
	add(id);
	Label n=new Label("Name ---");
	n.setBounds(220,65,45,25);
	add(n);
	TextField idt=new TextField();
	idt.setBounds(320,35,200,25);
	add(idt);
	TextField nt=new TextField();
	nt.setBounds(320,65,200,25);
	add(nt);
	Label fath=new Label("Father's Name ---");
	TextField fatht=new TextField();
	fath.setBounds(220,95,150,25);
	fatht.setBounds(370,95,200,25);
	add(fath);
	add(fatht);
	Label dob=new Label("D.O.B ---");
	TextField dobt=new TextField();
	dob.setBounds(220, 125, 100, 25);
	dobt.setBounds(320, 125, 100, 25);
	add(dob);
	add(dobt);
	Label hobb=new Label("Hobbies ---");
	hobb.setBounds(220, 155, 100, 65);
	CheckboxGroup hobbc= new CheckboxGroup();
	Checkbox box=new Checkbox("playing",hobbc,true);
	Checkbox box1=new Checkbox("reading",hobbc,false);
	box.setBounds(320, 165, 80, 25);
    box1.setBounds(320,185,80,25);
    add(box);
    add(box1);
	add(hobb);
	Label ad=new Label("Address ---");
	ad.setBounds(220, 240, 65, 25);
    add(ad);
    TextArea adt=new TextArea();
    adt.setBounds(320, 240, 200, 100);
    add(adt);
    Label mail=new Label("E-Mail ---");
    mail.setBounds(220, 430, 65, 25);
    add(mail);
    TextField mailt=new TextField();
    mailt.setBounds(320, 430, 200, 25);
    add(mailt);
    Label no=new Label("Mobile ---");
    no.setBounds(220, 470, 100, 25);
    add(no);
    TextField not=new TextField();
    not.setBounds(320, 470, 100, 25);
    add(not);
    Button sub=new Button("Submit");
    sub.setBounds(270, 520, 100, 25);
    add(sub);
	setLayout(null);
	
}
}
