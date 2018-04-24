package com.khetans.evening.gradecalculatorframework;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;


public class engg_bput_cse_sem3_subjects extends ActionBarActivity {

    //private ListView subjectListView;
    //private ArrayAdapter subjectItemArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engg_bput_cse_sem3_subjects);

        //All the work is done here

        //To create a new object to store the different dummy items
        //List<subjects> subject = new ArrayList<subjects>();


        //To put the data
        /*for(int i = 0; i < 6; i++) {
            subjects subject1 = new subjects();
            subject1.setName("My Subject");
            subject1.setCode("BC1234");
            subject1.setCredit(4);

/*




        //This is to create a single adapter
       /* subjectItemArrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, subject);
        subjectListView = (ListView) findViewById(R.id.listViewSubject);
        subjectListView.setAdapter(subjectItemArrayAdapter);*/


        //This is to create an array of holders
        /*subjectItemArrayAdapter = new subjectsAdapter(this, new String[5]);
        subjectListView = (ListView) findViewById(R.id.listViewSubject);
        subjectListView.setAdapter(subjectItemArrayAdapter);*/

        //Test #1 to put the data into holders
        //subjectListView.setAdapter((android.widget.ListAdapter) subject1);


        //Test #2
        // Construct the data source
        subjects[] arrayOfSubjects = new subjects[1];


        //New object to hold my data
        arrayOfSubjects = new subjects[]{
                new subjects("Maths 3", "BS1234", 4)};

        //To add item to adapter
        /*subjects newSub = new subjects("Nathan", "San Diego", 1 );
        adapter.add(newSub);*/
        subjects[] sem3Subjects = {
                //new subjects("hello", "Milk", 21),
                //new subjects("2", "Butter", 15),
                //new subjects("3", "Yogurt", 14),
                //new subjects("4", "Toothpaste", 7),
                //new subjects("5", "Ice Cream", 10),
        };

       // subjects newSub = new subjects("Maths", "knock", 4);

        // Create the adapter to convert the array to views
        subjectsAdapter adapter = new subjectsAdapter(this, arrayOfSubjects);

        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.listViewSubject);
        listView.setAdapter(adapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_engg_bput_cse_sem3_subjects, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
