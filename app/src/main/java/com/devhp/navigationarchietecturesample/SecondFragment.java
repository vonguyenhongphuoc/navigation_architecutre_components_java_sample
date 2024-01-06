package com.devhp.navigationarchietecturesample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devhp.navigationarchietecturesample.databinding.FragmentMainBinding;
import com.devhp.navigationarchietecturesample.databinding.FragmentSecondBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyTag", "SecondFragment onCreate");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("MyTag", "SecondFragment onCreateView");
        // Inflate the layout for this fragment
        LayoutInflater layoutInflater = LayoutInflater.from(getParentFragment().getContext());
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("MyTag", "SecondFragment onViewCreated");
        Bundle bundle = this.getArguments();
        if(bundle != null){
            String value = bundle.getString(MainActivity.KEY_BUNDLE);
            binding.tvContent.setText(value);
        }

        binding.btnNavigateOtherFragment.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_secondFragment_to_thirdFragment);
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyTag", "SecondFragment onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("MyTag", "SecondFragment onDestroyView");
    }
}