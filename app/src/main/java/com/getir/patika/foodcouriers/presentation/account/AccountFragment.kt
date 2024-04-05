package com.getir.patika.foodcouriers.presentation.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.getir.patika.foodcouriers.PagerAdapter
import com.getir.patika.foodcouriers.R
import com.getir.patika.foodcouriers.databinding.FragmentAccountBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.wada811.viewbindingktx.viewBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AccountFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AccountFragment : Fragment(R.layout.fragment_account) {

    private val binding by viewBinding(FragmentAccountBinding::bind)
    private lateinit var pagerAdapter: PagerAdapter

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireContext(), "Account Fragment", Toast.LENGTH_SHORT).show()

        binding.apply {
            pagerAdapter = PagerAdapter(childFragmentManager, lifecycle).apply {
                addFragment(CreateAccountFragment())
                addFragment(LoginAccountFragment())
            }
            viewPagerAccount.adapter = pagerAdapter

            TabLayoutMediator(tabAccount, viewPagerAccount) { tab, position ->
                when (position) {
                    0 -> tab.text = "Create Account"
                    1 -> tab.text = "Login"
                }
            }.attach()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AccountFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AccountFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}