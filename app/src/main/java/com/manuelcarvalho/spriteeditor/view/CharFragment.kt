package com.manuelcarvalho.spriteeditor.view


import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.manuelcarvalho.spriteeditor.R
import com.manuelcarvalho.spriteeditor.model.Pixel
import kotlinx.android.synthetic.main.fragment_char.*

private const val TAG = "CharFragment"
class CharFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_char, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listener = View.OnClickListener {v ->
            val b = v as Button

            b.setBackgroundColor(Color.RED)
            Log.d(TAG," ${b.id-2131230000}")
            val keyVal = getCharValue(b.id-2131230000)
            Log.d(TAG," ${keyVal.column} ${keyVal.row}")

        }

        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)
        button5.setOnClickListener(listener)
        button6.setOnClickListener(listener)
        button7.setOnClickListener(listener)
        button8.setOnClickListener(listener)
        button9.setOnClickListener(listener)
        button10.setOnClickListener(listener)

        button11.setOnClickListener(listener)
        button12.setOnClickListener(listener)
        button13.setOnClickListener(listener)
        button14.setOnClickListener(listener)
        button15.setOnClickListener(listener)
        button16.setOnClickListener(listener)
        button17.setOnClickListener(listener)
        button18.setOnClickListener(listener)
        button19.setOnClickListener(listener)
        button20.setOnClickListener(listener)

        button21.setOnClickListener(listener)
        button22.setOnClickListener(listener)
        button23.setOnClickListener(listener)
        button24.setOnClickListener(listener)
        button25.setOnClickListener(listener)
        button26.setOnClickListener(listener)
        button27.setOnClickListener(listener)
        button28.setOnClickListener(listener)
        button29.setOnClickListener(listener)
        button30.setOnClickListener(listener)

        button31.setOnClickListener(listener)
        button32.setOnClickListener(listener)
        button33.setOnClickListener(listener)
        button34.setOnClickListener(listener)
        button35.setOnClickListener(listener)
        button36.setOnClickListener(listener)
        button37.setOnClickListener(listener)
        button38.setOnClickListener(listener)
        button39.setOnClickListener(listener)
        button40.setOnClickListener(listener)

        button41.setOnClickListener(listener)
        button42.setOnClickListener(listener)
        button43.setOnClickListener(listener)
        button44.setOnClickListener(listener)
        button45.setOnClickListener(listener)
        button46.setOnClickListener(listener)
        button47.setOnClickListener(listener)
        button48.setOnClickListener(listener)
        button49.setOnClickListener(listener)
        button50.setOnClickListener(listener)

        button51.setOnClickListener(listener)
        button52.setOnClickListener(listener)
        button53.setOnClickListener(listener)
        button54.setOnClickListener(listener)
        button55.setOnClickListener(listener)
        button56.setOnClickListener(listener)
        button57.setOnClickListener(listener)
        button58.setOnClickListener(listener)
        button59.setOnClickListener(listener)
        button60.setOnClickListener(listener)

        button61.setOnClickListener(listener)
        button62.setOnClickListener(listener)
        button63.setOnClickListener(listener)
        button64.setOnClickListener(listener)

    }

    fun getCharValue(charKey: Int): Pixel{
        var col = 0
        var value = 0

        val buttonArray= arrayOf(
            arrayOf(790,801,812,823,834,845,851,852),
            arrayOf(853,791,792,793,794,795,796,797),
            arrayOf(798,799,800,802,803,804,805,806),
            arrayOf(807,808,809,810,811,813,814,815),
            arrayOf(816,817,818,819,820,821,822,824),
            arrayOf(825,826,827,828,829,830,831,832),
            arrayOf(833,835,836,837,838,839,840,841),
            arrayOf(842,843,844,846,847,848,849,850)
        )

        for (y in 0..7){
            for (x in 0..7){
                if (charKey == buttonArray[x][y]){
                    value = x
                    col = y
                }
            }
        }

        var pixel = Pixel(col, value)

        return pixel
    }


}
