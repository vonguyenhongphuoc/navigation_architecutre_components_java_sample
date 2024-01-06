package com.devhp.navigationarchietecturesample;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.devhp.navigationarchietecturesample.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyTag", "ThirdFragment onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("MyTag", "ThirdFragment onCreateView");
        assert getParentFragment() != null;
        LayoutInflater layoutInflater = LayoutInflater.from(getParentFragment().getContext());
        binding = FragmentThirdBinding.inflate(layoutInflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("MyTag", "ThirdFragment onViewCreated");
        binding.btnBackFragment.setOnClickListener(v -> {
            // Có 2 cách để từ  Fragment C về A và xóa B:
            // Cách 1: Best Practice, Recommend Use
            Navigation.findNavController(v).popBackStack(R.id.mainFragment, false);
            // Cách 2: Not Recommend
//            Navigation.findNavController(v).popBackStack(R.id.secondFragment, true);
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyTag", "ThirdFragment onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("MyTag", "ThirdFragment onDestroyView");
    }

}