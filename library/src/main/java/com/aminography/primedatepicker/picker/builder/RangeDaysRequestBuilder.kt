package com.aminography.primedatepicker.picker.builder

import com.aminography.primecalendar.PrimeCalendar
import com.aminography.primedatepicker.common.PickType
import com.aminography.primedatepicker.picker.PrimeDatePicker
import com.aminography.primedatepicker.picker.callback.RangeDaysPickCallback
import com.aminography.primedatepicker.utils.DateUtils

/**
 * `RangeDaysRequestBuilder` is a class in builder mechanism of [PrimeDatePicker] which contains
 * date picker configurations when the pick type is range of days.
 *
 * @author aminography
 */
class RangeDaysRequestBuilder<T : PrimeDatePicker> internal constructor(
    clazz: Class<T>,
    initialDateCalendar: PrimeCalendar,
    callback: RangeDaysPickCallback?
) : BaseRequestBuilder<T, RangeDaysPickCallback>(clazz, PickType.RANGE_START, initialDateCalendar, callback) {

    /**
     * Specifies initially picked range of days when the date picker is shown first time.
     *
     * @param startDay The [PrimeCalendar] to use as the start date of picked range.
     * @param endDay The [PrimeCalendar] to use as the end date of picked range.
     *
     * @return current instance of [RangeDaysRequestBuilder].
     */
    fun initiallyPickedRangeDays(startDay: PrimeCalendar, endDay: PrimeCalendar): RangeDaysRequestBuilder<T> {
        bundle.putString("pickedRangeStartCalendar", DateUtils.storeCalendar(startDay))
        bundle.putString("pickedRangeEndCalendar", DateUtils.storeCalendar(endDay))
        return this
    }

//    /**
//     * Specifies minimum length of range that can be picked.
//     *
//     * @param length The minimum length of range that can be picked.
//     *
//     * @return current instance of [RangeDaysRequestBuilder].
//     */
//    fun minRageLength(length: Int): RangeDaysRequestBuilder<T> {
//        bundle.putInt("minRageLength", length)
//        return this
//    }
//
//    /**
//     * Specifies maximum length of range that can be picked.
//     *
//     * @param length The maximum length of range that can be picked.
//     *
//     * @return current instance of [RangeDaysRequestBuilder].
//     */
//    fun maxRageLength(length: Int): RangeDaysRequestBuilder<T> {
//        bundle.putInt("maxRageLength", length)
//        return this
//    }

}