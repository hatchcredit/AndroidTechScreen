package nearside.interview.android.ui.main;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import nearside.interview.android.R;
import nearside.interview.android.databinding.FragmentMainBinding;

class MainFragment extends Fragment {

    public MainFragment() {
        super(R.layout.fragment_main);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        FragmentMainBinding binding = FragmentMainBinding.bind(view);

    }
}
