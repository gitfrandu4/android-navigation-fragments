package com.example.navigation_ii

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation_ii.databinding.FragmentRedBinding

class RedFragment : Fragment() {
    private var _binding: FragmentRedBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRedBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btGoBlue.setOnClickListener {
            // activity.supportFragmentManager.beginTransaction().replace(R.id.mainContainer, BlueFragment()).commit()

            activity?.let {
                it.supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainContainer, BlueFragment())
                    .commit()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}