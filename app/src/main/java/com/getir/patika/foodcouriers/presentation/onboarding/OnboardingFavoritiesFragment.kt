package com.getir.patika.foodcouriers.presentation.onboarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.getir.patika.foodcouriers.R
import com.getir.patika.foodcouriers.databinding.FragmentOnboardingFavoritiesBinding
import com.wada811.viewbindingktx.viewBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [OnboardingFavoritiesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OnboardingFavoritiesFragment : Fragment(R.layout.fragment_onboarding_favorities) {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private val binding by viewBinding(FragmentOnboardingFavoritiesBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btNext.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFavoritiesFragment_to_onboardingCheapFragment)
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment OnboardingFavoritiesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OnboardingFavoritiesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}