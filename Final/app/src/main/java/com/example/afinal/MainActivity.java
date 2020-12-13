package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MuscleItem> mMuscleList;
    private MuscleAdapter mAdapter;
    private ArrayList<RepItem> mRepList;
    private RepAdapter mRepAdapter;
    private final List<String> backList = new ArrayList<>();
    private final List<String> chestList = new ArrayList<>();
    private final List<String> legList = new ArrayList<>();

    Button btnWorkout;

    private String selectMuscles(String[] arr) {
        return (Arrays.toString(arr));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWorkout = findViewById(R.id.btnWorkout);
        btnWorkout.setOnClickListener(view -> {
            Intent intent_one = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent_one);

        });

        initList();
        Spinner spinnerMuscles = findViewById(R.id.spinner_muscles);
        mAdapter = new MuscleAdapter(this, mMuscleList);
        spinnerMuscles.setAdapter(mAdapter);
        spinnerMuscles.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MuscleItem clickedItem = (MuscleItem) parent.getItemAtPosition(position);
                String clickedMuscleName = clickedItem.getmuscleName();
                Toast.makeText(MainActivity.this, clickedMuscleName + " selected", Toast.LENGTH_SHORT).show();


                //This causes the program to crash.
                /*
                String cMuscle = (String) parent.getItemAtPosition(position);
                String muscleChoice = "";

                //selection trees to figure out which muscle group and which type
                //of workout
                if (cMuscle.equalsIgnoreCase("Chest Day")) {
                    muscleChoice = selectMuscles(chestDay());
                } else if (cMuscle.equalsIgnoreCase("Leg Day")) {
                    muscleChoice = selectMuscles(legDay());
                } else if (cMuscle.equalsIgnoreCase("Back Day")) {
                    muscleChoice = selectMuscles(backDay());
                }
                 */
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        initList();
        Spinner spinnerRep = findViewById(R.id.spinner_repetition);
        mRepAdapter = new RepAdapter(this, mRepList);
        spinnerRep.setAdapter(mRepAdapter);
        spinnerRep.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                RepItem clickedItemRep = (RepItem) parent.getItemAtPosition(position);
                String clickedMuscleName = clickedItemRep.getrepName();
                Toast.makeText(MainActivity.this, clickedMuscleName + " selected", Toast.LENGTH_SHORT).show();

                //THis causes it to crash as well
                /*
                String cRep = (String) parent.getItemAtPosition(position);
                String repChoice = "";
                if (cRep.equalsIgnoreCase("Lose Weight")) {
                    repChoice = "5 sets of 20 reps, with 1 minute of cardio between";
                } else if (cRep.equalsIgnoreCase("Gain muscle mass")) {
                    repChoice = "4 sets of 10 reps, or 5 sets of 8 reps";
                } else if (cRep.equalsIgnoreCase("Gain strength")) {
                    repChoice = "5 sets of 3 reps, increasing the weight\n"
                            + "until you can no longer lift the weight.";
                }

                 */
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void initList() {
        mMuscleList = new ArrayList<>();
        mMuscleList.add(new MuscleItem("Back", R.drawable.back));
        mMuscleList.add(new MuscleItem("Chest", R.drawable.chest));
        mMuscleList.add(new MuscleItem("Legs", R.drawable.legs));


        mRepList = new ArrayList<>();
        mRepList.add(new RepItem("Gain muscle mass", R.drawable.mass));
        mRepList.add(new RepItem("Gain strength", R.drawable.strength));
        mRepList.add(new RepItem("Lose weight", R.drawable.weight));


    }
        private String[] backDay() {
            if (backList.isEmpty()) {
                backList.add("Deadlift");
                backList.add("Pull Up");
                backList.add("Back Rows");
                backList.add("Bend-Over Barbell Rows");
                backList.add("Romanian Deadlift");
                backList.add("Front Squat");
                backList.add("Incline Dumbbell Row");
                backList.add("Chinup");
                backList.add("Trap-Bar Deadlift");
                backList.add("Alternating Dumbbell Row");
                backList.add("Inverted Row");
                backList.add("Swiss Ball Leg Curl");
                backList.add("Wide-Grip Pullup");
                backList.add("Landmine One-Arm Row");
                backList.add("Burpee");
                backList.add("Lying Lateral Raise");
                backList.add("Hang Clean");
            }
            return randomExercises(backList);
        }

        private String[] chestDay() {
            if (chestList.isEmpty()) {
                chestList.add("Bench Press");
                chestList.add("Incline Press");
                chestList.add("Dip");
                chestList.add("Flye");
                chestList.add("Reverse Flye");
                chestList.add("Supine Press");
                chestList.add("Chest Press Machine");
                chestList.add("Low-Incline Press");
                chestList.add("Speed Bench Press");
                chestList.add("Landmine Press");
                chestList.add("Floor Press");
                chestList.add("Prone Flye");
                chestList.add("Pullover");
                chestList.add("Plate Pressout");
                chestList.add("3-Way Flye");
                chestList.add("Pushup");
            }
            return randomExercises(chestList);
        }

        private String[] legDay() {
            if (legList.isEmpty()) {
                legList.add("Squat");
                legList.add("Leg Press");
                legList.add("Leg Extension");
                legList.add("Dumbbell Step Up");
                legList.add("Body Weight Calf Raises");
                legList.add("Walking Lunge");
                legList.add("Front Squat");
                legList.add("Bulgarian Split Squat");
                legList.add("Dumbbell Stepup");
                legList.add("Swiss Ball Leg Curl");
                legList.add("Single-Leg Romanian Deadlift");
                legList.add("Pause Squat");
                legList.add("Reverse Lunge");
                legList.add("Dumbbell Squat");
                legList.add("Kettlebell Swing");
                legList.add("Jump Squat");
                legList.add("Barbell Calf Raise");
            }
            return randomExercises(legList);
        }


        private String[] randomExercises(List<String> arr) {
            Collections.shuffle(arr);
            return arr.subList(0, 4).toArray(new String[3]);
        }
    }

