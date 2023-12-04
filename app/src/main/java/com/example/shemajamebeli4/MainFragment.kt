package com.example.shemajamebeli4

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shemajamebeli4.databinding.FragmentMainBinding


class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    private var adapter: ItemRecyclerAdapter ?= null
    private val viewModel:itemsViewModel by viewModels()

    private fun setUpRecycler() {
        adapter = ItemRecyclerAdapter()
        binding.recyclerView.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerView.adapter = adapter
        adapter!!.submitList(viewModel.items)
    }

    override fun setUp() {
        setUpRecycler()
    }

    override fun bindObserves() {
        TODO("Not yet implemented")
    }
}