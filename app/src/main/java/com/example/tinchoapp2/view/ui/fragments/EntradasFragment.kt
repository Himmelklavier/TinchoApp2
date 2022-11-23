package com.example.tinchoapp2.view.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tinchoapp2.R
import com.example.tinchoapp2.view.adapter.LibraryAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class EntradasFragment : Fragment() {

    lateinit var recyclerLib: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        val view=inflater.inflate(R.layout.fragment_entradas,container,false)
        recyclerLib=view.findViewById(R.id.recyclerview)
        val adapter = LibraryAdapter()
        recyclerLib.layoutManager= LinearLayoutManager(context)
        recyclerLib.adapter=adapter
        return  view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button=view.findViewById<BottomNavigationView>(R.id.buttonNavigationMenu)
        button.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.menu -> findNavController().navigate(R.id.action_menuFragment_to_entradasFragment)
            }
        }
        (activity as AppCompatActivity).setSupportActionBar(view?.findViewById(R.id.actionBarToolBar))
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_navigation_toolbar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.entradasFragment->{
                findNavController().navigate(R.id.action_menuFragment_to_entradasFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }



}