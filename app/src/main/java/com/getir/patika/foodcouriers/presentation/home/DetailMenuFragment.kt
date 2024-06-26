package com.getir.patika.foodcouriers.presentation.home

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.getir.patika.foodcouriers.R
import com.getir.patika.foodcouriers.databinding.FragmentDetailMenuBinding
import com.wada811.viewbindingktx.viewBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [DetailMenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailMenuFragment : Fragment(R.layout.fragment_detail_menu) {
    // TODO: Rename and change types of parameters
    private var param1: String? = "userid"
    private val args: DetailMenuFragmentArgs by navArgs()
    private val binding by viewBinding(FragmentDetailMenuBinding::bind)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), args.userid, Toast.LENGTH_LONG).show()
        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailMenuFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetailMenuFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)

                }
            }
    }
}