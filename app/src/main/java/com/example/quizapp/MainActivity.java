package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.quizapp.Model.Question;
import com.example.quizapp.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    List<Question> questions;
    static int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        try {
            Bundle extras = getIntent().getExtras();
            contador = extras.getInt("contador");
        } catch (Exception e) {
            contador = 0;
        }

        createQuestions();
    }

    private void createQuestions() {
        Question question0 = new Question(getString(R.string.questionTitle1), getString(R.string.question1), getString(R.string.trueAnswer1), getString(R.string.falseAnswer1));
        Question question1 = new Question(getString(R.string.questionTitle1), getString(R.string.question1), getString(R.string.trueAnswer1), getString(R.string.falseAnswer1));
        Question question2 = new Question(getString(R.string.questionTitle1), getString(R.string.question1), getString(R.string.trueAnswer1), getString(R.string.falseAnswer1));

        questions.add(question0);
        questions.add(question1);
        questions.add(question2);

    }


}