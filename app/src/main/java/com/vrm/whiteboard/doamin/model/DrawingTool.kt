package com.vrm.whiteboard.doamin.model
import com.vrm.whiteboard.R

enum class DrawingTool(
    val resId: Int
) {
    PEN(resId = R.drawable.ic_pen),
    HIGHLIGHTER(resId = R.drawable.ic_highlighter),
    LASER_PEN(resId = R.drawable.ic_laser_pen),
    ERASER(resId = R.drawable.ic_eraser),
    LINE_PLAIN(resId = R.drawable.ic_line_plain),
    LINE_DOTTED(resId = R.drawable.ic_line_dotted),
    ARROW_ONE_SIDED(resId = R.drawable.ic_arrow_one_sided),
    ARROW_TWO_SIDED(resId = R.drawable.ic_arrow_two_sided),
    RECTANGLE_FILLED(resId = R.drawable.ic_rectangle_filled),
    RECTANGLE_OUTLINE(resId = R.drawable.ic_rectangle_outlined),
    CIRCLE_FILLED(resId = R.drawable.ic_circle_filled),
    CIRCLE_OUTLINE(resId = R.drawable.ic_circle_outlined),
    TRIANGLE_FILLED(resId = R.drawable.ic_tringle_filled),
    TRIANGLE_OUTLINE(resId = R.drawable.ic_tringle_outlined),
}
