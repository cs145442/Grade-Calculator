package com.khetans.evening.gradecalculatorframework;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Laptop on 07-07-2015.
 */
public class subjectsAdapter extends ArrayAdapter {

    private LayoutInflater inflater;


    public subjectsAdapter(Activity activity, subjects[] items) {
        super(activity, R.layout.subject_n_grade, items);

        inflater = activity.getWindow().getLayoutInflater();
    }
/*
    public class UsersAdapter extends ArrayAdapter<User> {
        public UsersAdapter(Context context, ArrayList<User> users) {
            super(context, 0, users);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            User user = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
            }
            // Lookup view for data population
            TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
            TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
            // Populate the data into the template view using the data object
            tvName.setText(user.name);
            tvHome.setText(user.hometown);
            // Return the completed view to render on screen
            return convertView;
        }
    }
*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

       /* View view = inflater.inflate(R.layout.subject_n_grade, parent, false);

        //To change the subject name
        TextView subjectName = (TextView) view.findViewById(R.id.textView_subject_name);
        subjectName.setText("Subject Name" );

        //To change the subject code
        TextView subjectCode = (TextView) view.findViewById(R.id.textView_subject_code);
        subjectCode.setText("Code" );

        //To change the subject credit
        TextView subjectCredit = (TextView) view.findViewById(R.id.textView_subject_credit);
        subjectCredit.setText("1");

        return view;*/
        
        //Test #2
        // Get the data item for this position
        subjects mySub = (subjects) getItem(1);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.subject_n_grade, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.textView_subject_name);
        TextView tvCode = (TextView) convertView.findViewById(R.id.textView_subject_code);
        TextView tvCredit = (TextView) convertView.findViewById(R.id.textView_subject_credit);

        // Populate the data into the template view using the data object
        tvName.setText(mySub.name);
        tvCode.setText(mySub.code);
        tvCredit.setText(mySub.credit);

        // Return the completed view to render on screen
        return convertView;
    }

}