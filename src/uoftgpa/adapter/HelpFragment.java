package uoftgpa.adapter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.techseven.uoftgpa.R;
 
public class HelpFragment extends Fragment {
	private static Button moreinfo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
        View rootView = inflater.inflate(com.techseven.uoftgpa.R.layout.fragment_help, container, false);
        moreinfo=(Button) rootView.findViewById(R.id.button1);
        setupMoreBtn();
        
        return rootView;
    }
	private void setupMoreBtn() {
		// TODO Auto-generated method stub
		View.OnClickListener morelistener=new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.utm.utoronto.ca/registrar/sites/files/registrar/public/shared/pdfs/Making%20the%20Grade%202011.pdf"));
	        	startActivity(browserIntent);
			}
		};
		moreinfo.setOnClickListener(morelistener);
	}
}
