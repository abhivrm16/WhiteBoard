package com.vrm.whiteboard.presentation.whiteborad

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vrm.whiteboard.doamin.model.DrawingTool
import com.vrm.whiteboard.presentation.whiteboard.component.TopBar
import com.vrm.whiteboard.presentation.whiteborad.component.DrawingToolFAB
import com.vrm.whiteboard.presentation.whiteborad.component.DrawingToolsCard

@Composable
fun WhiteboardScreen(
    modifier:Modifier = Modifier
) {
    var isDrawingToolsCardVisible by rememberSaveable{ mutableStateOf(false) }
    var selectedDrawingTool by rememberSaveable{ mutableStateOf(DrawingTool.PEN) }

    Box(modifier = modifier.fillMaxSize()){
        TopBar(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(5.dp),
            onHomeIconClick = {},
            onUndoIconClick = {},
            onRedoIconClick = {},
            onStrokeWidthClick = {},
            onDrawingColorClick = {},
            onBackgroundColorClick ={},
            onSettingsClick = {}
        )
        DrawingToolFAB(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(20.dp),
            isVisible = !isDrawingToolsCardVisible,
            selectedTool = selectedDrawingTool,
            onClick = {isDrawingToolsCardVisible = true}
        )
        
        DrawingToolsCard(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp),
            isVisible = isDrawingToolsCardVisible,
            selectedTool = selectedDrawingTool,
            onToolClick = {selectedDrawingTool = it} ,
            onCloseIconClick = {
                isDrawingToolsCardVisible = false
            }
        )
    }
}