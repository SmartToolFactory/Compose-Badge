### Jetpack Compose Customizable Badge

Customizable Badge written with Jetpack Compose. Use `BadgeState` to set properties such as

*maxNumber:* after this number it's displayed with maxNumber+ such as 99+
*circleShapeThreshold:* number of digits that this will badge will be drawn as circle
*roundedRadiusPercent:* corner radius ratio when badge has rounded rectangle shape
*backgroundColor:* background color for badge
*horizontalPadding:* horizontal padding for rounded rectangle shape
*verticalPadding:* for rounded rectangle or general padding for circle shape
*textColor:* color of the text
*fontSize:* size of the font used for Text
*fontWeight:* The typeface thickness to use when painting the text (e.g., [FontWeight.Bold]).
*fontFamily:* The font family to be used when rendering the text. See [TextStyle.fontFamily].
*textDecoration:* The decorations to paint on the text (e.g., an underline).
*fontStyle:*  The typeface variant to use when drawing the letters (e.g., italic).
*shadow:* Shadow with elevation, dx, dy, radius and color traits.
*borderStroke:* nullable border stroke around badge
*showBadgeThreshold:* for count to display badge. If badge count is below this threshold don't display a badge. For instance don't display badge number of notification is zero.
<img src="/./screenshots/badge.gif" align="right" width="32%"/>