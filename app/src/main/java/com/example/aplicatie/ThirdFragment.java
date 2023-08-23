package com.example.aplicatie;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceControlViewHost;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.aplicatie.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment implements View.OnClickListener{

    private FragmentThirdBinding binding;

    private TextView totalPoints_r;
    private TextView autonomousPoints_r; private TextView teleopPoints_r; private TextView endgamePoints_r; private TextView pointsPenalties_r;

    private TextView cones_terminal_auto_r; private Button terminal_plus_auto_r; private Button terminal_minus_auto_r;
    private TextView cones_ground_auto_r; private Button ground_plus_auto_r; private Button ground_minus_auto_r;
    private TextView cones_low_auto_r; private Button low_plus_auto_r; private Button low_minus_auto_r;
    private TextView cones_mid_auto_r; private Button mid_plus_auto_r; private Button mid_minus_auto_r;
    private TextView cones_high_auto_r; private Button high_plus_auto_r; private Button high_minus_auto_r;

    private TextView cones_terminal_teleop_r; private Button terminal_plus_teleop_r; private Button terrminal_minus_teleop_r;
    private TextView cones_ground_teleop_r; private Button ground_plus_teleop_r; private Button ground_minus_teleop_r;
    private TextView cones_low_teleop_r; private Button low_plus_teleop_r; private Button low_minus_teleop_r;
    private TextView cones_mid_teleop_r; private Button mid_plus_teleop_r; private Button mid_minus_teleop_r;
    private TextView cones_high_teleop_r; private Button high_plus_teleop_r; private Button high_minus_teleop_r;

    private CheckBox checkCircuit_r; private CheckBox checkTerminal_r;

    private RadioGroup robotParking_r; private RadioButton noPark_r,terminalPark_r,substationPark_r,noBonusPark_r,sleeveBonusPark_r;

    private TextView topConeNumber_r; private Button topConePlus_r; private Button topConeMinus_r;
    private TextView beaconNumber_r; private Button beaconPlus_r; private Button beaconMinus_r;

    private TextView minorPenalties_r; private Button minorPlus_r; private Button minorMinus_r;
    private TextView majorPenalties_r; private Button majorPlus_r; private Button majorMinus_r;
    private ImageButton resetButton_r;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setUi();

        noPark_r.setOnClickListener(this);
        terminalPark_r.setOnClickListener(this);
        substationPark_r.setOnClickListener(this);
        noBonusPark_r.setOnClickListener(this);
        sleeveBonusPark_r.setOnClickListener(this);

        terminal_plus_auto_r.setOnClickListener(this);
        ground_plus_auto_r.setOnClickListener(this);
        low_plus_auto_r.setOnClickListener(this);
        mid_plus_auto_r.setOnClickListener(this);
        high_plus_auto_r.setOnClickListener(this);
        terminal_minus_auto_r.setOnClickListener(this);
        ground_minus_auto_r.setOnClickListener(this);
        low_minus_auto_r.setOnClickListener(this);
        mid_minus_auto_r.setOnClickListener(this);
        high_minus_auto_r.setOnClickListener(this);

        terminal_plus_teleop_r.setOnClickListener(this);
        ground_plus_teleop_r.setOnClickListener(this);
        low_plus_teleop_r.setOnClickListener(this);
        mid_plus_teleop_r.setOnClickListener(this);
        high_plus_teleop_r.setOnClickListener(this);
        terrminal_minus_teleop_r.setOnClickListener(this);
        ground_minus_teleop_r.setOnClickListener(this);
        low_minus_teleop_r.setOnClickListener(this);
        mid_minus_teleop_r.setOnClickListener(this);
        high_minus_teleop_r.setOnClickListener(this);

        topConeMinus_r.setOnClickListener(this);
        topConePlus_r.setOnClickListener(this);
        topConeNumber_r.setOnClickListener(this);
        beaconMinus_r.setOnClickListener(this);
        beaconPlus_r.setOnClickListener(this);

        minorPlus_r.setOnClickListener(this);
        minorMinus_r.setOnClickListener(this);
        majorMinus_r.setOnClickListener(this);
        majorPlus_r.setOnClickListener(this);

        checkCircuit_r.setOnClickListener(this);
        checkTerminal_r.setOnClickListener(this);

        resetButton_r.setOnClickListener(this);

    }

    int checkCircuit_rCount = 0; int checkTerminal_rCount = 0;

    int previousCheck_r = 0;

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.terminal_plus_auto_r:
                String newText = Integer.toString(Integer.parseInt(cones_terminal_auto_r.getText().toString()) + 1);
                cones_terminal_auto_r.setText(newText);
                String newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 2);
                totalPoints_r.setText(newText2);
                String newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) + 1);
                autonomousPoints_r.setText(newText3);
                String newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 1);
                teleopPoints_r.setText(newText4);
                String newText5 = Integer.toString(Integer.parseInt(cones_terminal_teleop_r.getText().toString()) + 1);
                cones_terminal_teleop_r.setText(newText5);
                break;
            case R.id.terminal_minus_auto_r:
                if (Integer.parseInt(cones_terminal_auto_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_terminal_auto_r.getText().toString()) - 1);
                    cones_terminal_auto_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 2);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - 1);
                    autonomousPoints_r.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 1);
                    teleopPoints_r.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_terminal_teleop_r.getText().toString()) - 1);
                    cones_terminal_teleop_r.setText(newText5);
                }
                break;
            case R.id.ground_plus_auto_r:
                newText = Integer.toString(Integer.parseInt(cones_ground_auto_r.getText().toString()) + 1);
                cones_ground_auto_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 4);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) + 2);
                autonomousPoints_r.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 2);
                teleopPoints_r.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_ground_teleop_r.getText().toString()) + 1);
                cones_ground_teleop_r.setText(newText5);
                break;
            case R.id.ground_minus_auto_r:
                if (Integer.parseInt(cones_ground_auto_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_ground_auto_r.getText().toString()) - 1);
                    cones_ground_auto_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 4);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - 2);
                    autonomousPoints_r.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 2);
                    teleopPoints_r.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_ground_teleop_r.getText().toString()) - 1);
                    cones_ground_teleop_r.setText(newText5);
                }
                break;
            case R.id.low_plus_auto_r:
                newText = Integer.toString(Integer.parseInt(cones_low_auto_r.getText().toString()) + 1);
                cones_low_auto_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 6);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) + 3);
                autonomousPoints_r.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 3);
                teleopPoints_r.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_low_teleop_r.getText().toString()) + 1);
                cones_low_teleop_r.setText(newText5);
                break;
            case R.id.low_minus_auto_r:
                if (Integer.parseInt(cones_low_auto_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_low_auto_r.getText().toString()) - 1);
                    cones_low_auto_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 6);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - 3);
                    autonomousPoints_r.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 3);
                    teleopPoints_r.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_low_teleop_r.getText().toString()) - 1);
                    cones_low_teleop_r.setText(newText5);
                }
                break;
            case R.id.mid_plus_auto_r:
                newText = Integer.toString(Integer.parseInt(cones_mid_auto_r.getText().toString()) + 1);
                cones_mid_auto_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 8);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) + 4);
                autonomousPoints_r.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 4);
                teleopPoints_r.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_mid_teleop_r.getText().toString()) + 1);
                cones_mid_teleop_r.setText(newText5);
                break;
            case R.id.mid_minus_auto_r:
                if (Integer.parseInt(cones_mid_auto_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_mid_auto_r.getText().toString()) - 1);
                    cones_mid_auto_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 8);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - 4);
                    autonomousPoints_r.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 4);
                    teleopPoints_r.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_mid_teleop_r.getText().toString()) - 1);
                    cones_mid_teleop_r.setText(newText5);
                }
                break;
            case R.id.high_plus_auto_r:
                newText = Integer.toString(Integer.parseInt(cones_high_auto_r.getText().toString()) + 1);
                cones_high_auto_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 10);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) + 5);
                autonomousPoints_r.setText(newText3);
                newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 5);
                teleopPoints_r.setText(newText4);
                newText5 = Integer.toString(Integer.parseInt(cones_high_teleop_r.getText().toString()) + 1);
                cones_high_teleop_r.setText(newText5);
                break;
            case R.id.high_minus_auto_r:
                if (Integer.parseInt(cones_high_auto_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_high_auto_r.getText().toString()) - 1);
                    cones_high_auto_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 10);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - 5);
                    autonomousPoints_r.setText(newText3);
                    newText4 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 5);
                    teleopPoints_r.setText(newText4);
                    newText5 = Integer.toString(Integer.parseInt(cones_high_teleop_r.getText().toString()) - 1);
                    cones_high_teleop_r.setText(newText5);
                }
                break;
            case R.id.terminal_plus_teleop_r:
                newText = Integer.toString(Integer.parseInt(cones_terminal_teleop_r.getText().toString()) + 1);
                cones_terminal_teleop_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 1);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 1);
                teleopPoints_r.setText(newText3);
                break;
            case R.id.terminal_minus_teleop:
                if (Integer.parseInt(cones_terminal_teleop_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_terminal_teleop_r.getText().toString()) - 1);
                    cones_terminal_teleop_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 1);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 1);
                    teleopPoints_r.setText(newText3);
                }
                break;
            case R.id.ground_plus_teleop_r:
                newText = Integer.toString(Integer.parseInt(cones_ground_teleop_r.getText().toString()) + 1);
                cones_ground_teleop_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 2);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 2);
                teleopPoints_r.setText(newText3);
                break;
            case R.id.ground_minus_teleop_r:
                if (Integer.parseInt(cones_ground_teleop_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_ground_teleop_r.getText().toString()) - 1);
                    cones_ground_teleop_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 2);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 2);
                    teleopPoints_r.setText(newText3);
                }
                break;
            case R.id.low_plus_teleop_r:
                newText = Integer.toString(Integer.parseInt(cones_low_teleop_r.getText().toString()) + 1);
                cones_low_teleop_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 3);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 3);
                teleopPoints_r.setText(newText3);
                break;
            case R.id.low_minus_teleop_r:
                if (Integer.parseInt(cones_low_teleop_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_low_teleop_r.getText().toString()) - 1);
                    cones_low_teleop_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 3);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 3);
                    teleopPoints_r.setText(newText3);
                }
                break;
            case R.id.mid_plus_teleop_r:
                newText = Integer.toString(Integer.parseInt(cones_mid_teleop_r.getText().toString()) + 1);
                cones_mid_teleop_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 4);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 4);
                teleopPoints_r.setText(newText3);
                break;
            case R.id.mid_minus_teleop_r:
                if (Integer.parseInt(cones_mid_teleop_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_mid_teleop_r.getText().toString()) - 1);
                    cones_mid_teleop_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 4);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 4);
                    teleopPoints_r.setText(newText3);
                }
                break;
            case R.id.high_plus_teleop_r:
                newText = Integer.toString(Integer.parseInt(cones_high_teleop_r.getText().toString()) + 1);
                cones_high_teleop_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 5);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) + 5);
                teleopPoints_r.setText(newText3);
                break;
            case R.id.high_minus_teleop_r:
                if (Integer.parseInt(cones_high_teleop_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(cones_high_teleop_r.getText().toString()) - 1);
                    cones_high_teleop_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 5);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(teleopPoints_r.getText().toString()) - 5);
                    teleopPoints_r.setText(newText3);
                }
                break;
            case R.id.topConePlus_r:
                newText = Integer.toString(Integer.parseInt(topConeNumber_r.getText().toString()) + 1);
                topConeNumber_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 3);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) + 3);
                endgamePoints_r.setText(newText3);
                break;
            case R.id.topConeMinus_r:
                if (Integer.parseInt(topConeNumber_r.getText().toString()) != 0) {
                    newText = Integer.toString(Integer.parseInt(topConeNumber_r.getText().toString()) - 1);
                    topConeNumber_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 3);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) - 3);
                    endgamePoints_r.setText(newText3);
                }
                break;
            case R.id.beaconPlus_r:
                if (Integer.parseInt(beaconNumber_r.getText().toString()) < 1){
                    newText = Integer.toString(Integer.parseInt(beaconNumber_r.getText().toString()) + 1);
                    beaconNumber_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 10);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) + 10);
                    endgamePoints_r.setText(newText3);
                }
                break;
            case R.id.beaconMinus_r:
                if (Integer.parseInt(beaconNumber_r.getText().toString()) != 0){
                    newText = Integer.toString(Integer.parseInt(beaconNumber_r.getText().toString()) - 1);
                    beaconNumber_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 10);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) - 10);
                    endgamePoints_r.setText(newText3);
                }
                break;
            case R.id.minorPlus_r:
                newText = Integer.toString(Integer.parseInt(minorPenalties_r.getText().toString()) + 1);
                minorPenalties_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 10);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(pointsPenalties_r.getText().toString()) - 10);
                pointsPenalties_r.setText(newText3);
                break;
            case R.id.minorMinus_r:
                if (Integer.parseInt(minorPenalties_r.getText().toString()) != 0){
                    newText = Integer.toString(Integer.parseInt(minorPenalties_r.getText().toString()) - 1);
                    minorPenalties_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 10);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(pointsPenalties_r.getText().toString()) + 10);
                    pointsPenalties_r.setText(newText3);
                }
                break;
            case R.id.majorPlus_r:
                newText = Integer.toString(Integer.parseInt(majorPenalties_r.getText().toString()) + 1);
                majorPenalties_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 30);
                totalPoints_r.setText(newText2);
                newText3 = Integer.toString(Integer.parseInt(pointsPenalties_r.getText().toString()) - 30);
                pointsPenalties_r.setText(newText3);
                break;
            case R.id.majorMinus_r:
                if (Integer.parseInt(majorPenalties_r.getText().toString()) != 0){
                    newText = Integer.toString(Integer.parseInt(majorPenalties_r.getText().toString()) - 1);
                    majorPenalties_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 30);
                    totalPoints_r.setText(newText2);
                    newText3 = Integer.toString(Integer.parseInt(pointsPenalties_r.getText().toString()) + 30);
                    pointsPenalties_r.setText(newText3);
                }
                break;
            case R.id.checkCircuit_r:
                checkCircuit_rCount ++;
                if (checkCircuit_rCount % 2 == 1){
                    newText = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) + 20);
                    endgamePoints_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 20);
                    totalPoints_r.setText(newText2);
                }
                else if (checkCircuit_rCount % 2 == 0 && checkCircuit_rCount > 0){
                    newText = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) - 20);
                    endgamePoints_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 20);
                    totalPoints_r.setText(newText2);
                }
                break;
            case R.id.checkTerminal_r:
                checkTerminal_rCount ++;
                if (checkTerminal_rCount % 2 == 1){
                    newText = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) + 2);
                    endgamePoints_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) + 2);
                    totalPoints_r.setText(newText2);
                }
                else if (checkTerminal_rCount % 2 == 0 && checkTerminal_rCount > 0){
                    newText = Integer.toString(Integer.parseInt(endgamePoints_r.getText().toString()) - 2);
                    endgamePoints_r.setText(newText);
                    newText2 = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - 2);
                    totalPoints_r.setText(newText2);
                }
                break;
            case R.id.noPark_r:
                newText = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - previousCheck_r);
                totalPoints_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - previousCheck_r);
                autonomousPoints_r.setText(newText2);
                previousCheck_r = 0;
                break;
            case R.id.terminalPark_r:
            case R.id.substationPark_r:
                newText = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - previousCheck_r + 2);
                totalPoints_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - previousCheck_r + 2);
                autonomousPoints_r.setText(newText2);
                previousCheck_r = 2;
                break;
            case R.id.noBonusPark_r:
                newText = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - previousCheck_r + 10);
                totalPoints_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - previousCheck_r + 10);
                autonomousPoints_r.setText(newText2);
                previousCheck_r = 10;
                break;
            case R.id.sleeveBonusPark_r:
                newText = Integer.toString(Integer.parseInt(totalPoints_r.getText().toString()) - previousCheck_r + 20);
                totalPoints_r.setText(newText);
                newText2 = Integer.toString(Integer.parseInt(autonomousPoints_r.getText().toString()) - previousCheck_r + 20);
                autonomousPoints_r.setText(newText2);
                previousCheck_r = 20;
                break;
            case R.id.resetButton_r:
                totalPoints_r.setText(String.valueOf(0));
                autonomousPoints_r.setText(String.valueOf(0));
                teleopPoints_r.setText(String.valueOf(0));
                endgamePoints_r.setText(String.valueOf(0));
                pointsPenalties_r.setText(String.valueOf(0));
                robotParking_r.clearCheck();
                cones_ground_auto_r.setText(String.valueOf(0));
                cones_terminal_auto_r.setText(String.valueOf(0));
                cones_low_auto_r.setText(String.valueOf(0));
                cones_mid_auto_r.setText(String.valueOf(0));
                cones_high_auto_r.setText(String.valueOf(0));
                cones_ground_teleop_r.setText(String.valueOf(0));
                cones_terminal_teleop_r.setText(String.valueOf(0));
                cones_low_teleop_r.setText(String.valueOf(0));
                cones_mid_teleop_r.setText(String.valueOf(0));
                cones_high_teleop_r.setText(String.valueOf(0));
                topConeNumber_r.setText(String.valueOf(0));
                beaconNumber_r.setText(String.valueOf(0));
                minorPenalties_r.setText(String.valueOf(0));
                majorPenalties_r.setText(String.valueOf(0));
                checkCircuit_r.setChecked(false);
                checkTerminal_r.setChecked(false);
                previousCheck_r = 0;
                checkCircuit_rCount = 0;
                checkTerminal_rCount = 0;
                break;

        }
    }
    private void setUi() {
        resetButton_r = getView().findViewById(R.id.resetButton_r);
        totalPoints_r = getView().findViewById(R.id.totalPoints_r);
        autonomousPoints_r = getView().findViewById(R.id.autonomousPoints_r);
        teleopPoints_r = getView().findViewById(R.id.teleopPoints_r);
        endgamePoints_r = getView().findViewById(R.id.endgamePoints_r);
        pointsPenalties_r = getView().findViewById(R.id.pointsPenalties_r);

        robotParking_r = getView().findViewById(R.id.robotParking_r);
        noPark_r = getView().findViewById(R.id.noPark_r);
        terminalPark_r = getView().findViewById(R.id.terminalPark_r);
        substationPark_r = getView().findViewById(R.id.substationPark_r);
        noBonusPark_r = getView().findViewById(R.id.noBonusPark_r);
        sleeveBonusPark_r = getView().findViewById(R.id.sleeveBonusPark_r);

        cones_terminal_auto_r = getView().findViewById(R.id.cones_terminal_auto_r);
        terminal_plus_auto_r = getView().findViewById(R.id.terminal_plus_auto_r);
        terminal_minus_auto_r = getView().findViewById(R.id.terminal_minus_auto_r);

        cones_ground_auto_r = getView().findViewById(R.id.cones_ground_auto_r);
        ground_plus_auto_r = getView().findViewById(R.id.ground_plus_auto_r);
        ground_minus_auto_r = getView().findViewById(R.id.ground_minus_auto_r);

        cones_low_auto_r = getView().findViewById(R.id.cones_low_auto_r);
        low_plus_auto_r = getView().findViewById(R.id.low_plus_auto_r);
        low_minus_auto_r = getView().findViewById(R.id.low_minus_auto_r);

        cones_mid_auto_r = getView().findViewById(R.id.cones_mid_auto_r);
        mid_plus_auto_r = getView().findViewById(R.id.mid_plus_auto_r);
        mid_minus_auto_r = getView().findViewById(R.id.mid_minus_auto_r);

        cones_high_auto_r = getView().findViewById(R.id.cones_high_auto_r);
        high_plus_auto_r = getView().findViewById(R.id.high_plus_auto_r);
        high_minus_auto_r = getView().findViewById(R.id.high_minus_auto_r);

        cones_terminal_teleop_r = getView().findViewById(R.id.cones_terminal_teleop_r);
        terminal_plus_teleop_r = getView().findViewById(R.id.terminal_plus_teleop_r);
        terrminal_minus_teleop_r = getView().findViewById(R.id.terminal_minus_teleop_r);

        cones_ground_teleop_r = getView().findViewById(R.id.cones_ground_teleop_r);
        ground_plus_teleop_r = getView().findViewById(R.id.ground_plus_teleop_r);
        ground_minus_teleop_r = getView().findViewById(R.id.ground_minus_teleop_r);

        cones_low_teleop_r = getView().findViewById(R.id.cones_low_teleop_r);
        low_plus_teleop_r = getView().findViewById(R.id.low_plus_teleop_r);
        low_minus_teleop_r = getView().findViewById(R.id.low_minus_teleop_r);

        cones_mid_teleop_r = getView().findViewById(R.id.cones_mid_teleop_r);
        mid_plus_teleop_r = getView().findViewById(R.id.mid_plus_teleop_r);
        mid_minus_teleop_r = getView().findViewById(R.id.mid_minus_teleop_r);

        cones_high_teleop_r = getView().findViewById(R.id.cones_high_teleop_r);
        high_plus_teleop_r = getView().findViewById(R.id.high_plus_teleop_r);
        high_minus_teleop_r = getView().findViewById(R.id.high_minus_teleop_r);

        topConeNumber_r = getView().findViewById(R.id.topConeNumber_r);
        topConeMinus_r = getView().findViewById(R.id.topConeMinus_r);
        topConePlus_r = getView().findViewById(R.id.topConePlus_r);
        beaconNumber_r = getView().findViewById(R.id.beaconNumber_r);
        beaconPlus_r = getView().findViewById(R.id.beaconPlus_r);
        beaconMinus_r = getView().findViewById(R.id.beaconMinus_r);

        minorPenalties_r = getView().findViewById(R.id.minorPenalties_r);
        majorPenalties_r = getView().findViewById(R.id.majorPenalties_r);
        minorMinus_r = getView().findViewById(R.id.minorMinus_r);
        minorPlus_r = getView().findViewById(R.id.minorPlus_r);
        majorMinus_r = getView().findViewById(R.id.majorMinus_r);
        majorPlus_r = getView().findViewById(R.id.majorPlus_r);

        checkCircuit_r = getView().findViewById(R.id.checkCircuit_r);
        checkTerminal_r = getView().findViewById(R.id.checkTerminal_r);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}