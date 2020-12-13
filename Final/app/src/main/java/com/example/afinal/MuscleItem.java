package com.example.afinal;

class MuscleItem {

    private String mMuscleName;
    private int mMuscleImage;
    public MuscleItem(String muscleName, int muscleImage) {
        mMuscleName = muscleName;
        mMuscleImage = muscleImage;
    }
    public String getmuscleName() {

        return mMuscleName;
    }
    public int getMuscleImage() {

        return mMuscleImage;
    }
}