package com.alwin.common;

/**
 * 值转换工具
 */
final public class ValueHelper {

    private ValueHelper(){}

    /**
     * 将对象值尝试转换为int类型值，当无法转换时，返回数值0
     * @param object
     * @return
     * @see #toInt(Object, int)
     */
    public static int toInt(Object object){
        return toInt(object, 0);
    }

    /**
     * 将对象值尝试转换为int类型值，当无法转换时，返回传入的默认值;
     * <p>
     *     具备以下转换功能:
     *     <li>当等于NULL时，返回入参defaultValue值</li>
     *     <li>当为一个{@link Number}对象时，返回此对象的{@link Number#intValue()}方法值</li>
     *     <li>当为一个{@link Boolean}对象时，若等于{@link Boolean#TRUE}则返回1；否则返回0</li>
     *     <li>当为一个{@link String}对象时，将使用{@link Integer#parseInt(String)}方法解析该字串；解析失败时返回入参defaultValue值，否则返回解析结果</li>
     *     <li>其他类型值不做出路，直接返回入参defaultValue值</li>
     * </p>
     * @param object
     * @return
     */
    public static int toInt(Object object, int defaultValue){
        //TODO
        return defaultValue;
    }
}
