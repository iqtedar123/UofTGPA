package uoftgpa.adapter;
import java.util.ArrayList;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.techseven.uoftgpa.R;
public class CalculatorFragment extends Fragment implements View.OnClickListener {
	private static CheckBox weight11,weight12, weight21, weight22, weight31, weight32, weight41, weight42, weight51,weight52;
	private static EditText mark1,mark2,mark3,mark4,mark5;
	private static TextView outputmark;
	private static Button go,clearall;
	private static double m1,m2,m3,m4,m5,totalpoint,w1,w2,w3,w4,w5,list_item,total_gpa,total_weight;
	private static String mark_string,m11,m22,m33,m44,m55,w11,w22,w33,w44,w55;
	private static Double weight_string;
	private static double totalstring;
	private static ArrayList<String> mark;
	private static ArrayList<Double> weight,gpa,weights_num,marks_num;
	private static double weight1,weight2,weight3,weight4,weight5;
	private static TextView l1,l2,l3,l4,l5,header1,header2;
	private static double total,weight_total;
	public static int size_weight;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(com.techseven.uoftgpa.R.layout.fragment_calculator, container, false);
        go = (Button) rootView.findViewById(R.id.button1);
        l1=(TextView) rootView.findViewById(R.id.textView3);
        l2=(TextView) rootView.findViewById(R.id.textView4);
        l3=(TextView) rootView.findViewById(R.id.textView5);
        l4=(TextView) rootView.findViewById(R.id.textView6);
        l5=(TextView) rootView.findViewById(R.id.textView7);
        header1=(TextView) rootView.findViewById(R.id.textView1);
        header2=(TextView) rootView.findViewById(R.id.textView2);
        
        weight11=(CheckBox) rootView.findViewById(R.id.checkBox1);
        weight12=(CheckBox) rootView.findViewById(R.id.checkBox2);
        weight21=(CheckBox) rootView.findViewById(R.id.checkBox3);
        weight22=(CheckBox) rootView.findViewById(R.id.checkBox4);
        weight31=(CheckBox) rootView.findViewById(R.id.checkBox5);
        weight32=(CheckBox) rootView.findViewById(R.id.checkBox6);
        weight41=(CheckBox) rootView.findViewById(R.id.checkBox7);
        weight42=(CheckBox) rootView.findViewById(R.id.checkBox8);
        weight51=(CheckBox) rootView.findViewById(R.id.checkBox9);
        weight52=(CheckBox) rootView.findViewById(R.id.checkBox10);
    	clearall=(Button) rootView.findViewById(R.id.button2);
    	mark1=(EditText) rootView.findViewById(R.id.editText1);
    	mark2=(EditText) rootView.findViewById(R.id.editText2);
    	mark3=(EditText) rootView.findViewById(R.id.editText3);
    	mark4=(EditText) rootView.findViewById(R.id.editText4);
    	mark5=(EditText) rootView.findViewById(R.id.editText5);
    	mark1.setTextColor(Color.WHITE);
    	l1.setTextColor(Color.WHITE);
    	l2.setTextColor(Color.WHITE);
    	l3.setTextColor(Color.WHITE);
    	l4.setTextColor(Color.WHITE);
    	l5.setTextColor(Color.WHITE);
    	header1.setTextColor(Color.WHITE);
    	header2.setTextColor(Color.WHITE);
    	go.setTextColor(Color.WHITE);
    	clearall.setTextColor(Color.WHITE);

    	weight11.setTextColor(Color.WHITE);
    	weight12.setTextColor(Color.WHITE);
    	weight21.setTextColor(Color.WHITE);
    	weight22.setTextColor(Color.WHITE);
    	weight31.setTextColor(Color.WHITE);
    	weight32.setTextColor(Color.WHITE);
    	weight41.setTextColor(Color.WHITE);
    	weight42.setTextColor(Color.WHITE);
    	weight51.setTextColor(Color.WHITE);
    	weight52.setTextColor(Color.WHITE);
    	
    	mark2.setTextColor(Color.WHITE);
    	mark3.setTextColor(Color.WHITE);
    	mark4.setTextColor(Color.WHITE);
    	mark5.setTextColor(Color.WHITE);
    	outputmark=(TextView) rootView.findViewById(R.id.textView11);
    	setupGoBtn();
    	setupClearallBtn();
        return rootView;
    }    
    
	private void setupClearallBtn() {
		// TODO Auto-generated method stub
		clearall.setTextColor(Color.WHITE);
		View.OnClickListener clearlistener=new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mark1.setText("");
				mark2.setText("");
				mark3.setText("");
				mark4.setText("");
				mark5.setText("");
				outputmark.setText("");
				
			}
		};
		clearall.setOnClickListener(clearlistener);
	}
	protected void setupGoBtn() {
		// TODO Auto-generated method stub
		
		go.setTextColor(Color.WHITE);
		View.OnClickListener glistener=new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				total=0;
				// store the marks and weights (as objects) in a 2 parrallel lists
				if (mark1.getText() != null  ){
					mark.add(mark1.getText().toString());
				}
				if (mark2.getText()!= null ){
					mark.add(mark2.getText().toString());
				}
				if (mark3.getText()!= null ){
					mark.add(mark3.getText().toString());
				}
				if (mark4.getText() != null ){
					mark.add(mark4.getText().toString());
				}
				if (mark5.getText() != null ){
					mark.add(mark5.getText().toString());
				}
				
				if (weight11.isChecked()) {
					weight1=1.0;
				} else if (weight12.isChecked()) {
					weight1=0.5;
				} else{
					weight1=0.0;
				}
				if (weight21.isChecked()) {
					weight2=1.0;
				} else if (weight22.isChecked()) {
					weight2=0.5;
				} else{
					weight2=0.0;
				}
				if (weight31.isChecked()) {
					weight3=1.0;
				} else if (weight32.isChecked()) {
					weight3=0.5;
				} else{
					weight3=0.0;
				}
				if (weight41.isChecked()) {
					weight4=1.0;
				} else if (weight42.isChecked()) {
					weight4=0.5;
				} 
				else{
					weight4=0.0;
				}
				if (weight51.isChecked()) {
					weight5=1.0;
				} else if (weight52.isChecked()) {
					weight5=0.5;
				}else{
					weight5=0.0;
				}
				weight.add(weight1);
				weight.add(weight2);
				weight.add(weight3);
				weight.add(weight4);
				weight.add(weight5);

				//mark.trimToSize();
				//weight.trimToSize();
				
				// keep only valid marks and weights
				for(int i = 0; i<mark.size(); i=i+1) {
					mark_string = mark.get(i);
					marks_num.add(Double.valueOf(mark_string));
				};
				for(int i = 0; i<weight.size(); i=i+1) {
					weight_string = weight.get(i);
					if (weight_string >=0.5) {
						weights_num.add(weight_string);
					}
				};
				//marks_num.trimToSize();
				//weights_num.trimToSize();
				
				//get the gpa
				for (int p=0; p<marks_num.size(); p=p+1){
					list_item = marks_num.get(p);
					if (list_item<=100.0 & list_item>=85.0 ){
						list_item=4.0;
					}else if (list_item>=80) {
						list_item=3.7;
					}else if (list_item>=77 & list_item<=79){
						list_item=3.3;
					}else if (list_item>=73 & list_item<=76){
						list_item=3.0;
					}else if (list_item>=70 & list_item<=72){
						list_item=2.7;
					}else if (list_item>=67 & list_item<=69){
						list_item=2.3;
					}else if (list_item>=63 & list_item<=66){
						list_item=2.0;
					}else if (list_item>=60 & list_item<=62){
						list_item=1.7;
					}else if (list_item>=57 & list_item<=59){
						list_item=1.3;
					}else if (list_item>=53 & list_item<=56){
						list_item=1.0;
					}else if (list_item>=50 & list_item<=52){
						list_item=0.7;
					}else{
						list_item=0.0;
					}
					gpa.add(list_item);
				};
				// calculate the final GPA
				total_gpa = 0;
				total_weight = 0;
				size_weight=weights_num.size();
				for(int i =0; i<gpa.size();i=i+1) {
					total_gpa =total_gpa+ gpa.get(i) ;
				};
				total_weight = weights_num.size();
				totalstring = total_gpa/total_weight;
				outputmark.setText(Double.toString(totalstring));
				
			}
		};
		go.setOnClickListener(glistener);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
    
}