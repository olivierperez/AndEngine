package org.anddev.andengine.opengl.util;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 23:06:51 - 11.08.2011
 */
public class BufferUtils {
	// ===========================================================
	// Constants
	// ===========================================================

	static {
		System.loadLibrary("andengine");
	}

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * @param pByteBuffer must be a direct Buffer.
	 * @param pSource
	 * @param pLength to copy in pSource.
	 * @param pOffset in pSource.
	 */
	public static void put(final ByteBuffer pByteBuffer, final float[] pSource, final int pLength, final int pOffset) {
		BufferUtils.jniPut(pByteBuffer, pSource, pLength, pOffset);
		pByteBuffer.position(0);
		pByteBuffer.limit(pLength << 2);
	}

	private native static void jniPut(final Buffer pBuffer, final float[] pSource, final int pLength, final int pOffset);

	public static short getUnsignedByte(final ByteBuffer pByteBuffer) {
		return (short) (pByteBuffer.get() & 0xFF);
	}

	public static void putUnsignedByte(final ByteBuffer pByteBuffer, final int pValue) {
		pByteBuffer.put((byte) (pValue & 0xFF));
	}

	public static short getUnsignedByte(final ByteBuffer pByteBuffer, final int pPosition) {
		return (short) (pByteBuffer.get(pPosition) & (short) 0xFF);
	}

	public static void putUnsignedByte(final ByteBuffer pByteBuffer, final int pPosition, final int pValue) {
		pByteBuffer.put(pPosition, (byte) (pValue & 0xFF));
	}

	public static int getUnsignedShort(final ByteBuffer pByteBuffer) {
		return pByteBuffer.getShort() & 0xFFFF;
	}

	public static void putUnsignedShort(final ByteBuffer pByteBuffer, final int pValue) {
		pByteBuffer.putShort((short) (pValue & 0xFFFF));
	}

	public static int getUnsignedShort(final ByteBuffer pByteBuffer, final int pPosition) {
		return pByteBuffer.getShort(pPosition) & 0xFFFF;
	}

	public static void putUnsignedShort(final ByteBuffer pByteBuffer, final int pPosition, final int pValue) {
		pByteBuffer.putShort(pPosition, (short) (pValue & 0xFFFF));
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}