package org.andengine.util.level.simple;

import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.level.IEntityLoaderDataSource;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 16:13:09 - 19.04.2012
 */
public class SimpleLevelEntityLoaderDataSource implements IEntityLoaderDataSource {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final VertexBufferObjectManager mVertexBufferObjectManager;

	// ===========================================================
	// Constructors
	// ===========================================================

	public SimpleLevelEntityLoaderDataSource(final VertexBufferObjectManager pVertexBufferObjectManager) {
		this.mVertexBufferObjectManager = pVertexBufferObjectManager;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public VertexBufferObjectManager getVertexBufferObjectManager() {
		return this.mVertexBufferObjectManager;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}