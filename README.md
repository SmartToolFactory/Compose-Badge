### Jetpack Compose Customizable Badge

Customizable Badge written with Jetpack Compose.
Displays numbers either as circle or rounded rectangle depending on badge count and selected threshold to transform from circle to rounded rectangle.

Use `BadgeState` with properties</br>

**maxNumber:** after this number it's displayed with maxNumber+ such as 99+</br>
**circleShapeThreshold:** number of digits that this will badge will be drawn as circle</br>
**roundedRadiusPercent:** corner radius ratio when badge has rounded rectangle shape</br>
**backgroundColor:** background color for badge</br>
**horizontalPadding:** horizontal padding for rounded rectangle shape</br>
**verticalPadding:** for rounded rectangle or general padding for circle shape</br>
**textColor:** color of the text</br>
**fontSize:** size of the font used for Text</br>
**fontWeight:** The typeface thickness to use when painting the text (e.g.,FontWeight.Bold).</br>
**fontFamily:** The font family to be used when rendering the text.</br>
**textDecoration:** The decorations to paint on the text (e.g., an underline).</br>
**fontStyle:**  The typeface variant to use when drawing the letters (e.g., italic).</br>
**shadow:** Shadow with elevation, dx, dy, radius and color traits.</br>
**borderStroke:** nullable border stroke around badge</br>
**showBadgeThreshold:** for count to display badge. If badge count is below this threshold don't display a badge. For instance don't display badge number of notification is zero.</br>

<img src="/./screenshots/badge.gif"/>

