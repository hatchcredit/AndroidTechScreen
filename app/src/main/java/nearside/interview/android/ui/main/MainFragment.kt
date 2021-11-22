package nearside.interview.android.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import nearside.interview.android.R
import nearside.interview.android.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentMainBinding.bind(view)

        /*TODO code here*/
    }
}
