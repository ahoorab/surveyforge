/* 
 * surveyforge-core - Copyright (C) 2006 OPEN input - http://www.openinput.com/
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the 
 * Free Software Foundation; either version 2 of the License, or (at your 
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to 
 *   the Free Software Foundation, Inc., 
 *   59 Temple Place, Suite 330, 
 *   Boston, MA 02111-1307 USA
 *   
 * $Id$
 */
package org.surveyforge.core.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An object variable defines the concept of a variable in connection with a defined statistical object (e.g. the income of a person).
 * The general description of the meaning of the variable is part of the global variable definition, which is linked to the object
 * variable. Several object variables can be defined for one global variable to define specific types of object variables.
 * 
 * @author jsegura
 */
public class ObjectVariable implements Serializable
  {
  private static final long     serialVersionUID = 4288089682729653747L;

  /**
   * Unique and language independent identifier for the object variable. The identifier is unique among all object variables. The
   * identifier should contain identifications for the statistical object and the global variable it is based on.
   */
  private String                identifier;
  /** The name is the official, language dependent name of the global variable, provided by the owner of the variable. */
  private String                name             = "";
  /** Short general multilingual description of the object variable, including its purpose, its main subject areas etc. */
  private String                description      = "";
  /**
   * Each object variable belongs to a statistical object or unit. The object variable exists only in the context of the object
   * variable.
   */
  private StatisticalObjectType statisticalObjectType;
  /** An object variable should refer to a global variable definition that reflects the general concepts of the object variable. */
  private GlobalVariable        globalVariable;
  /** Based on an object variable a number of data elements may refer to this object variable. */
  private List<DataElement>     dataElements     = new ArrayList<DataElement>( );


  /**
   * Creates a new instance of ObjectVariable identified by identifier.
   * 
   * @param identifier The identifier to set.
   * @throws NullPointerException If the identifier is <code>null</code> or is empty.
   */
  public ObjectVariable( String identifier )
    {
    this.setIdentifier( identifier );
    }

  /**
   * Returns the identifier of the ObjectVariable.
   * 
   * @return Returns the identifier.
   */
  public String getIdentifier( )
    {
    return this.identifier;
    }

  /**
   * Sets the new identifier of the ObjectVariable.
   * 
   * @param identifier The identifier to set.
   * @throws NullPointerException If the identifier is <code>null</code> or is empty.
   */
  public void setIdentifier( String identifier )
    {
    if( identifier != null && !identifier.equals( "" ) )
      this.identifier = identifier;
    else
      throw new NullPointerException( );
    }

  /**
   * Returns the name of the ObjectVariable.
   * 
   * @return Returns the name.
   */
  public String getName( )
    {
    return this.name;
    }

  /**
   * Sets the name of the ObjectVariable.
   * 
   * @param name The name to set.
   * @throws NullPointerException If the name is <code>null</code>.
   */
  public void setName( String name )
    {
    if( name != null )
      this.name = name;
    else
      throw new NullPointerException( );
    }

  /**
   * Returns the description of the ObjectVariable.
   * 
   * @return Returns the description.
   */
  public String getDescription( )
    {
    return this.description;
    }

  /**
   * Sets a new description to the ObjectVariable.
   * 
   * @param description The description to set.
   * @throws NullPointerException If the description is <code>null</code>.
   */
  public void setDescription( String description )
    {
    if( description != null )
      this.description = description;
    else
      throw new NullPointerException( );
    }

  /**
   * Returns the {@link StatisticalObjectType} this ObjectVariable belongs to.
   * 
   * @return Returns the StatisticalObjectType.
   */
  public StatisticalObjectType getStatisticalObjectType( )
    {
    return this.statisticalObjectType;
    }

  /**
   * Sets a new {@link StatisticalObjectType} this ObjectVariable belongs to.
   * 
   * @param statisticalObjectType The statisticalObjectType to set.
   * @throws NullPointerException If the statisticalObjectType is <code>null</code>.
   */
  public void setStatisticalObjectType( StatisticalObjectType statisticalObjectType )
    {
    if( statisticalObjectType != null )
      this.statisticalObjectType = statisticalObjectType;
    else
      throw new NullPointerException( );
    }

  /**
   * Returns the {@link GlobalVariable} this ObjectVariable is linked to.
   * 
   * @return Returns the globalVariable.
   */
  public GlobalVariable getGlobalVariable( )
    {
    return this.globalVariable;
    }

  /**
   * Returns the new {@link GlobalVariable} this ObjectVariable is linked to.
   * 
   * @param globalVariable The globalVariable to set.
   * @throws NullPointerException If the globalVariable is <code>null</code>.
   */
  public void setGlobalVariable( GlobalVariable globalVariable )
    {
    if( globalVariable != null )
      this.globalVariable = globalVariable;
    else
      throw new NullPointerException( );
    }

  /**
   * Returns the list of {@link DataElement} linked to this ObjectVariable.
   * 
   * @return Returns the list of dataElements.
   */
  public List<DataElement> getDataElements( )
    {
    return Collections.unmodifiableList( dataElements );
    }

  /**
   * Adds a new {@link DataElement} to the list.
   * 
   * @param dataElements The dataElements to add.
   */
  protected void addDataElement( DataElement dataElement )
    {
    this.dataElements.add( dataElement );
    }

  /**
   * Removes a {@link DataElement} from the list.
   * 
   * @param dataElements The dataElements to remove.
   */
  protected void removeDataElement( DataElement dataElement )
    {
    this.dataElements.remove( dataElement );
    }

  }