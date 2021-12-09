package com.smarttoolfactory.composebadge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay


@Composable
fun BadgeSamples() {

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        color = Color(0xff00897B)
    )

    Column(modifier = Modifier.fillMaxSize()) {
        TopAppbar()
        Content()
    }
}

@Composable
private fun Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        val badge1 = rememberBadgeState(
            shadow = MaterialShadow()
        )

        Badge(badgeState = badge1)
        Spacer(modifier = Modifier.height(4.dp))

        val badge2 = rememberBadgeState(
            fontSize = 12.sp,
            shadow = MaterialShadow(elevation = 4.dp)
        )
        Badge(badgeState = badge2)
        Spacer(modifier = Modifier.height(4.dp))

        val badge3 = rememberBadgeState(
            fontSize = 14.sp,
            circleShapeThreshold = 2,
            textColor = Color(0xffB2DFDB),
            backgroundColor = Color(0xff00897B)
        )
        Badge(badgeState = badge3)
        Spacer(modifier = Modifier.height(4.dp))

        val badge4 = rememberBadgeState(
            fontSize = 18.sp,
            borderStroke = BorderStroke(2.dp, Color(0xff29B6F6)),
            shadow = MaterialShadow(elevation = 4.dp)
        )
        Badge(badgeState = badge4)
        Spacer(modifier = Modifier.height(4.dp))

        val badge5 = rememberBadgeState(
            backgroundColor = Color.Transparent,
            textColor = Color(0xffF57C00),
            borderStroke = BorderStroke(2.dp, Color(0xffF57C00))

        )
        Badge(badgeState = badge5)
        Spacer(modifier = Modifier.height(4.dp))

        val badge6 = rememberBadgeState(

        )
        Badge(badgeState = badge6)
        Spacer(modifier = Modifier.height(4.dp))

        val badge7 = rememberBadgeState(
            fontSize = 40.sp,
            textColor = Color.White,
            backgroundColor = Color(0xff795548)
        )
        Badge(badgeState = badge7)
        Spacer(modifier = Modifier.height(4.dp))

        val badge8 = rememberBadgeState(
            fontSize = 40.sp,
            horizontalPadding = 24.dp,
            textColor = Color.White,
            backgroundColor = Color(0xff3F51B5)
        )
        Badge(badgeState = badge8)
        Spacer(modifier = Modifier.height(4.dp))

        val badge9 = rememberBadgeState(
            fontSize = 64.sp,
            textColor = Color.White,
            backgroundColor = Color(0xffD81B60),
            roundedRadiusPercent = 20,
            shadow = MaterialShadow(
                elevation = 5.dp,
                color = Color(0xffD32F2F)
            )
        )
        Badge(badgeState = badge9)
        Spacer(modifier = Modifier.height(6.dp))

        val badge10 = rememberBadgeState(
            maxNumber = 49,
            circleShapeThreshold = 2,
            fontSize = 64.sp,
            textColor = Color.White,
            backgroundColor = Color(0xff607D8B),
            roundedRadiusPercent = 70
        )
        Badge(badgeState = badge10)

        val badgeStateList = listOf(
            badge1,
            badge2,
            badge3,
            badge4,
            badge5,
            badge6,
            badge7,
            badge8,
            badge9,
            badge10
        )

        LaunchedEffect(Unit) {
            repeat(101) {
                delay(100)
                badgeStateList.forEach { badgeState ->
                    badgeState.setBadgeCount(it)
                }
            }
        }
    }
}

@Composable
private fun TopAppbar() {
    Surface(elevation = 4.dp) {
        Column {
            var selectedIndex by remember { mutableStateOf(0) }

            TopAppBar(
                title = {
                    Text(text = "Custom Remember", color = Color.White)
                },
                backgroundColor = Color(0xff00897B),
                elevation = 8.dp
            )

            val list = listOf(
                "CHATS",
                "STATUS",
                "CALLS"
            )
            val badgeChats = rememberBadgeState(
                backgroundColor = Color.White,
                textColor = Color(0xff00897B),
                fontSize = 12.sp,
                horizontalPadding = 2.dp,
            )
            badgeChats.setBadgeCount(9)

            val badgeStatus = rememberBadgeState(
                backgroundColor = Color.White,
                textColor = Color(0xff00897B),
                fontSize = 12.sp,
                horizontalPadding = 2.dp
            )
            badgeStatus.setBadgeCount(80)

            val badgeCalls = rememberBadgeState(
                backgroundColor = Color.White,
                textColor = Color(0xff00897B),
                fontSize = 12.sp,
                horizontalPadding = 2.dp,
                showBadgeThreshold = 1
            )

            val badgeStates = listOf(
                badgeChats,
                badgeStatus,
                badgeCalls,
            )

            LaunchedEffect(key1 = Unit) {
                delay(2000)
                badgeStatus.setBadgeCount(100)
                delay(1000)
                badgeCalls.setBadgeCount(5)
                delay(1000)
                badgeCalls.setBadgeCount(42)
            }

            TabRow(
                selectedTabIndex = selectedIndex,
                backgroundColor = Color(0xff00897B),
                indicator = { tabPositions: List<TabPosition> ->
                    TabRowDefaults.Indicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedIndex]),
                        height = 3.dp,
                        color = Color.White
                    )
                }
            ) {
                list.forEachIndexed { index, text ->
                    Tab(selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        selectedContentColor = Color.White,
                        unselectedContentColor = Color(0xff77a9a0),
                        text = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = text,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Badge(badgeState = badgeStates[index])
                            }
                        }
                    )
                }
            }
        }
    }
}