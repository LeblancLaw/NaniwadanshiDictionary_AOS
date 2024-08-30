package com.example.mobileprogramming_0505

import java.util.Date
import java.util.Locale
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.icu.text.SimpleDateFormat
import android.net.Uri
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.PopupWindow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var plusActionButton: ImageButton
    private lateinit var cardContainer: GridLayout
    private val debutDate = "2021-11-12"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plusActionButton = findViewById(R.id.plus_action)
        cardContainer = findViewById(R.id.cardContainer)

        // 현재 날짜 가져오기
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val currentDate = Date()

        // 데뷔일 가져오기
        val debutDateObj = sdf.parse(debutDate)

        // 데뷔일부터 현재까지의 날짜 차이 계산
        val diffInMillis = currentDate.time - debutDateObj.time
        val diffInDays = diffInMillis / (1000 * 60 * 60 * 24)

        // 며칠 지났는지 TextView에 표시
        val daysSinceDebutTextView = findViewById<TextView>(R.id.daysSinceDebutTextView)
        daysSinceDebutTextView.text = "(데뷔일로부터 $diffInDays 일 지났음)"

        // 각 카드뷰에 대한 클릭 리스너 추가
        for (i in 0 until cardContainer.childCount) {
            val cardView = cardContainer.getChildAt(i)
            cardView.setOnClickListener {
                showPopup(cardView)
            }
        }

        // 플러스 액션 버튼 클릭 시 팝업 메뉴 표시
        plusActionButton.setOnClickListener {
            showPopupMenu(it)
        }

        val accordionHeader = findViewById<LinearLayout>(R.id.accordionHeader)
        val accordionContent = findViewById<LinearLayout>(R.id.accordionContent)
        val arrowImageView = findViewById<ImageView>(R.id.arrowImageView)

        accordionHeader.setOnClickListener {
            if (accordionContent.visibility == View.VISIBLE) {
                accordionContent.visibility = View.GONE
                arrowImageView.setImageResource(R.drawable.ic_arrow_down) // 화살표 아래로
            } else {
                accordionContent.visibility = View.VISIBLE
                arrowImageView.setImageResource(R.drawable.ic_arrow_up) // 화살표 위로
            }
        }
    }

    private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_twitter -> {
                    openUrl("https://twitter.com/728_Storm")
                    true
                }
                R.id.menu_instagram -> {
                    openUrl("https://www.instagram.com/naniwadanshi728official/")
                    true
                }
                R.id.menu_youtube -> {
                    openUrl("https://www.youtube.com/channel/UCDtVdj7sm41Ysg3XSiSUH3w")
                    true
                }
                R.id.menu_homepage -> {
                    openUrl("https://starto.jp/s/p/artist/56?lang=en&ima=2008")
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

    private fun showPopup(cardView: View) {
        val layoutResId = when (cardView.id) {
            R.id.cardview1 -> R.layout.detail_layout_1 //밋치
            R.id.cardview2 -> R.layout.detail_layout_2 //쿄헤
            R.id.cardview3 -> R.layout.detail_layout_3 //죠
            R.id.cardview4 -> R.layout.detail_layout_4 //켄토
            R.id.cardview5 -> R.layout.detail_layout_5 //카즈
            R.id.cardview6 -> R.layout.detail_layout_6 //다이고
            R.id.cardview7 -> R.layout.detail_layout_7 //류쩨
            else -> R.layout.detail_layout_1
        }

        // 선택한 레이아웃을 인플레이션
        val inflater = LayoutInflater.from(cardView.context)
        val popupView = inflater.inflate(layoutResId, null)

        // 팝업 윈도우 생성
        val popupWindow = PopupWindow(
            popupView,
            ViewGroup.LayoutParams.MATCH_PARENT, // 너비를 화면의 너비에 맞추기
            ViewGroup.LayoutParams.MATCH_PARENT  // 높이를 화면의 높이에 맞추기
        )

        // 팝업 윈도우의 배경 설정 (팝업 내용이 잘리지 않도록)
        popupWindow.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        // 팝업 윈도우의 닫기 버튼 설정
        val closeButton = popupView.findViewById<ImageButton>(R.id.closeButton)
        closeButton.setOnClickListener {
            popupWindow.dismiss() // 팝업 닫기
        }

        // 팝업을 액티비티의 중앙에 표시
        val parentLayout = findViewById<View>(android.R.id.content)
        popupWindow.showAtLocation(parentLayout, Gravity.CENTER, 0, 0)
    }


    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}