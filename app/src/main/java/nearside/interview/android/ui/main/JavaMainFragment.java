package nearside.interview.android.ui.main;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import nearside.interview.android.R;
import nearside.interview.android.databinding.FragmentMainBinding;

class JavaMainFragment extends Fragment {

    public JavaMainFragment() {
        super(R.layout.fragment_main);
    }

    //TODO change the fragment in activity_main.xml!
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainViewModelJava viewModel = new ViewModelProvider(this).get(MainViewModelJava.class);
        FragmentMainBinding binding = FragmentMainBinding.bind(view);

    }
}
