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


/**
 * The global variable defines the general concept of a statistical variable (e.g. income). More special definitions can be provided
 * when combining a global variable with a statistical object to an {@link ObjectVariable}. Variable families can group global
 * variables.
 * 
 * @author jsegura
 */
public class GlobalVariable implements Serializable
  {
  private static final long serialVersionUID = 1661678204467740737L;

  /** A global variable is identified by a unique language independent identifier, which may typically be an abbreviation of its name. */
  private String            identifier;
  /** The official name of the global variable is provided by the owner of the variable. */
  private String            name             = "";
  /**
   * Short general multilingual description of the global variable, including its purpose, its main subject areas etc.
   */
  private String            description      = "";

  /** Family to which the global variable belongs. */
  private VariableFamily    variableFamily;

  /**
   * Creates a new GlobalVariable identified by the identifier
   * 
   * @param identifier The identifier of the GlobalVariable.
   * @throws NullPointerException If the identifier is <code>null</code> or is empty.
   */
  public GlobalVariable( String identifier )
    {
    this.setIdentifier( identifier );
    }

  /**
   * Returns the identifier of the Global Variable.
   * 
   * @return Returns the identifier.
   */
  public String getIdentifier( )
    {
    return this.identifier;
    }

  /**
   * Sets a new identifier for the GlobalVariable.
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
   * Returns the name of the GlobalVariable.
   * 
   * @return Returns the name.
   */
  public String getName( )
    {
    return this.name;
    }

  /**
   * Sets a new name to the GlobalVariable.
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
   * Returns the description of the GlobalVariable.
   * 
   * @return Returns the description.
   */
  public String getDescription( )
    {
    return this.description;
    }

  /**
   * Sets a new description of the GlobalVariable.
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
   * Returns the {@link VariableFamily} of the GlobalVariable.
   * 
   * @return Returns the variableFamily.
   */
  public VariableFamily getVariableFamily( )
    {
    return this.variableFamily;
    }

  /**
   * Sets the new {@link VariableFamily} of the GlobalVariable.
   * 
   * @param variableFamily The variableFamily to set.
   * @throws NullPointerException If the {@link VariableFamily} is <code>null</code>.
   */
  public void setVariableFamily( VariableFamily variableFamily )
    {
    if( this.variableFamily != null ) this.variableFamily.removeGlobalVariable( this );
    this.variableFamily = variableFamily;
    if( this.variableFamily != null ) this.variableFamily.addGlobalVariable( this );
    }


  }
