package com.example.assingment4;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<ProgrammingLanguage> languageList;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


        languageList = new ArrayList<>();
        languageList.add(new ProgrammingLanguage(
                "C++", R.drawable.plusc, R.drawable.java, R.drawable.php, R.drawable.c));

        languageList.add(new ProgrammingLanguage(
                "Java", R.drawable.java, R.drawable.plusc, R.drawable.php, R.drawable.c));

        languageList.add(new ProgrammingLanguage(
                "PHP", R.drawable.php, R.drawable.java, R.drawable.plusc, R.drawable.c));

        languageList.add(new ProgrammingLanguage(
                "C", R.drawable.c, R.drawable.java, R.drawable.php, R.drawable.plusc));
        customAdapter = new CustomAdapter(this, languageList);
        listView.setAdapter(customAdapter);
    }
}
