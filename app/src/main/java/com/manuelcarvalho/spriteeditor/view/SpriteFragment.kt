package com.manuelcarvalho.spriteeditor.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.manuelcarvalho.spriteeditor.R
import kotlinx.android.synthetic.main.fragment_sprite.*

/**
 * A simple [Fragment] subclass.
 */
class SpriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sprite, container, false)
       
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val canvasView = SpriteCanvas(view?.context)
        frame.addView(canvasView)
    }


}
