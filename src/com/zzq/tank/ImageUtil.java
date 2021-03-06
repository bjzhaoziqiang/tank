package com.zzq.tank;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageUtil {
    /**
     *
     * @Description 旋转图片
     * @author zhaoziqiang
     * @date 2020/7/15 11:55
     * @param [bufferedimage  图片, degree 旋转角度]
     * @return java.awt.image.BufferedImage
     */
	public static BufferedImage rotateImage(final BufferedImage bufferedimage,
            final int degree) {
        int w = bufferedimage.getWidth();
        int h = bufferedimage.getHeight();
        int type = bufferedimage.getColorModel().getTransparency();
        BufferedImage img;
        Graphics2D graphics2d;
        (graphics2d = (img = new BufferedImage(w, h, type))
                .createGraphics()).setRenderingHint(
                RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2d.rotate(Math.toRadians(degree), w / 2, h / 2);
        graphics2d.drawImage(bufferedimage, 0, 0, null);
        graphics2d.dispose();
        return img;
    }
}
