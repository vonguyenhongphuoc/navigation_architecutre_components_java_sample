package com.devhp.navigationarchietecturesample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devhp.navigationarchietecturesample.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {
    private  FragmentMainBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyTag", "MainFragment onCreate");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("MyTag", "MainFragment onCreateView");
        // Inflate the layout for this fragment
        assert getParentFragment() != null;
        LayoutInflater layoutInflater = LayoutInflater.from(getParentFragment().getContext());
        binding = FragmentMainBinding.inflate(layoutInflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("MyTag", "MainFragment onViewCreated");
        binding.btnNavigateOtherFragment.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            String value = binding.etContent.getText().toString().trim();
            bundle.putString(MainActivity.KEY_BUNDLE, value);
            Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_secondFragment, bundle);
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyTag", "MainFragment onDestroy");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("MyTag", "MainFragment onDestroyView");
    }
}