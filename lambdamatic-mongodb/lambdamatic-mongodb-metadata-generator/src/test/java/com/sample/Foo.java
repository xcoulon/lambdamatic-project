/*******************************************************************************
 * Copyright (c) 2014 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package com.sample;

import java.util.Date;

import org.bson.types.ObjectId;
import org.lambdamatic.mongodb.annotations.Document;
import org.lambdamatic.mongodb.annotations.DocumentField;
import org.lambdamatic.mongodb.annotations.DocumentId;
import org.lambdamatic.mongodb.types.geospatial.Location;

/**
 * @author Xavier Coulon <xcoulon@redhat.com>
 *
 */
@Document(collection="foos")
public class Foo {

	public static class FooBuilder {
		private ObjectId id;
		private String stringField;
		private byte primitiveByteField;
		private short primitiveShortField;
		private int primitiveIntField;
		private long primitiveLongField;
		private float primitiveFloatField;
		private double primitiveDoubleField;
		private boolean primitiveBooleanField;
		private char primitiveCharField;
		private EnumFoo enumFoo;
		private Location location;
		private Date date;
		private Bar bar;

		public FooBuilder withId(final ObjectId id) {
			this.id = id;
			return this;
		}

		public FooBuilder withPrimitiveByteField(final byte primitiveByteField) {
			this.primitiveByteField = primitiveByteField;
			return this;
		}
		
		public FooBuilder withPrimitiveShortField(final short primitiveShortField) {
			this.primitiveShortField = primitiveShortField;
			return this;
		}
		
		public FooBuilder withPrimitiveIntField(final int primitiveIntField) {
			this.primitiveIntField = primitiveIntField;
			return this;
		}
		
		public FooBuilder withPrimitiveLongField(final long primitiveLongField) {
			this.primitiveLongField = primitiveLongField;
			return this;
		}
		
		public FooBuilder withPrimitiveFloatField(final float primitiveFloatField) {
			this.primitiveFloatField = primitiveFloatField;
			return this;
		}
		
		public FooBuilder withPrimitiveDoubleField(final double primitiveDoubleField) {
			this.primitiveDoubleField = primitiveDoubleField;
			return this;
		}
		
		public FooBuilder withPrimitiveBooleanField(final boolean primitiveBooleanField) {
			this.primitiveBooleanField = primitiveBooleanField;
			return this;
		}
		
		public FooBuilder withPrimitiveCharField(final char primitiveCharField) {
			this.primitiveCharField = primitiveCharField;
			return this;
		}
		
		public FooBuilder withStringField(final String stringField) {
			this.stringField = stringField;
			return this;
		}
		
		public FooBuilder withEnumFoo(final EnumFoo enumFoo) {
			this.enumFoo = enumFoo;
			return this;
		}

		public FooBuilder withLocation(final double latitude, final double longitude) {
			this.location = new Location(latitude, longitude);
			return this;
		}
		
		public FooBuilder withDate(Date date) {
			this.date = date;
			return this;
		}
		
		public FooBuilder withBar(Bar bar) {
			this.bar = bar;
			return this;
		}
		
		public Foo build() {
			return new Foo(this);
		}

	}
	
	@DocumentId 
	private ObjectId id;
	
	@DocumentField
	private String stringField;

	@DocumentField
	private byte primitiveByteField;
	
	@DocumentField
	private short primitiveShortField;
	
	@DocumentField
	private int primitiveIntField;

	@DocumentField
	private long primitiveLongField;

	@DocumentField
	private float primitiveFloatField;

	@DocumentField
	private double primitiveDoubleField;
	
	@DocumentField
	private boolean primitiveBooleanField;
	
	@DocumentField
	private char primitiveCharField;
	
	@DocumentField
	private EnumFoo enumFoo;
	
	@DocumentField
	private Location location;
	
	private Bar bar;
	
	@DocumentField
	private Date date;
	
	public Foo() {
		
	}

	public Foo(final FooBuilder fooBuilder) {
		this.id = fooBuilder.id;
		this.enumFoo = fooBuilder.enumFoo;
		this.location = fooBuilder.location;
		this.stringField = fooBuilder.stringField;
		this.primitiveBooleanField = fooBuilder.primitiveBooleanField;
		this.primitiveByteField = fooBuilder.primitiveByteField;
		this.primitiveCharField = fooBuilder.primitiveCharField;
		this.primitiveDoubleField = fooBuilder.primitiveDoubleField;
		this.primitiveFloatField = fooBuilder.primitiveFloatField;
		this.primitiveIntField = fooBuilder.primitiveIntField;
		this.primitiveLongField = fooBuilder.primitiveLongField;
		this.primitiveShortField = fooBuilder.primitiveShortField;
		this.primitiveShortField = fooBuilder.primitiveShortField;
		this.date = fooBuilder.date;
		this.bar = fooBuilder.bar;
	}

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the stringField
	 */
	public String getStringField() {
		return stringField;
	}

	/**
	 * @param stringField the stringField to set
	 */
	public void setStringField(String stringField) {
		this.stringField = stringField;
	}

	/**
	 * @return the primitiveByteField
	 */
	public byte getPrimitiveByteField() {
		return primitiveByteField;
	}

	/**
	 * @param primitiveByteField the primitiveByteField to set
	 */
	public void setPrimitiveByteField(byte primitiveByteField) {
		this.primitiveByteField = primitiveByteField;
	}

	/**
	 * @return the primitiveShortField
	 */
	public short getPrimitiveShortField() {
		return primitiveShortField;
	}

	/**
	 * @param primitiveShortField the primitiveShortField to set
	 */
	public void setPrimitiveShortField(short primitiveShortField) {
		this.primitiveShortField = primitiveShortField;
	}

	/**
	 * @return the primitiveIntField
	 */
	public int getPrimitiveIntField() {
		return primitiveIntField;
	}

	/**
	 * @param primitiveIntField the primitiveIntField to set
	 */
	public void setPrimitiveIntField(int primitiveIntField) {
		this.primitiveIntField = primitiveIntField;
	}

	/**
	 * @return the primitiveLongField
	 */
	public long getPrimitiveLongField() {
		return primitiveLongField;
	}

	/**
	 * @param primitiveLongField the primitiveLongField to set
	 */
	public void setPrimitiveLongField(long primitiveLongField) {
		this.primitiveLongField = primitiveLongField;
	}

	/**
	 * @return the primitiveFloatField
	 */
	public float getPrimitiveFloatField() {
		return primitiveFloatField;
	}

	/**
	 * @param primitiveFloatField the primitiveFloatField to set
	 */
	public void setPrimitiveFloatField(float primitiveFloatField) {
		this.primitiveFloatField = primitiveFloatField;
	}

	/**
	 * @return the primitiveDoubleField
	 */
	public double getPrimitiveDoubleField() {
		return primitiveDoubleField;
	}

	/**
	 * @param primitiveDoubleField the primitiveDoubleField to set
	 */
	public void setPrimitiveDoubleField(double primitiveDoubleField) {
		this.primitiveDoubleField = primitiveDoubleField;
	}

	/**
	 * @return the primitiveBooleanField
	 */
	public boolean isPrimitiveBooleanField() {
		return primitiveBooleanField;
	}

	/**
	 * @param primitiveBooleanField the primitiveBooleanField to set
	 */
	public void setPrimitiveBooleanField(boolean primitiveBooleanField) {
		this.primitiveBooleanField = primitiveBooleanField;
	}

	/**
	 * @return the primitiveCharField
	 */
	public char getPrimitiveCharField() {
		return primitiveCharField;
	}

	/**
	 * @param primitiveCharField the primitiveCharField to set
	 */
	public void setPrimitiveCharField(char primitiveCharField) {
		this.primitiveCharField = primitiveCharField;
	}

	/**
	 * @return the enumFoo
	 */
	public EnumFoo getEnumFoo() {
		return enumFoo;
	}

	/**
	 * @param enumFoo the enumFoo to set
	 */
	public void setEnumFoo(EnumFoo enumFoo) {
		this.enumFoo = enumFoo;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Bar getBar() {
		return bar;
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

}