package com.example.calculadoras;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class CalculadoraCientifica  extends Activity implements OnClickListener{
	String pantalla;
	double reciduo=0.0;
	double reciduo2=0.0;
	    int signo=-1;
	    String total="";
	    int shifts=1;
	    int punto=0;
	   
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);		
			setContentView(R.layout.calculadora_cientifica);
			
			final Button uno=(Button)findViewById(R.id.unoo);		
			final Button dos=(Button)findViewById(R.id.doss);
			final Button tres=(Button)findViewById(R.id.tres);
			final Button cuatro=(Button)findViewById(R.id.cuatro);
			final Button cinco=(Button)findViewById(R.id.cinco);
			final Button seis=(Button)findViewById(R.id.seis);
			final Button siete=(Button)findViewById(R.id.siete);
			final Button ocho=(Button)findViewById(R.id.ocho);
			final Button nueve=(Button)findViewById(R.id.nueve);
			final Button cero=(Button)findViewById(R.id.ceros);
			final Button atras=(Button)findViewById(R.id.jButton2);
			final Button suma=(Button)findViewById(R.id.mas);
			final Button menos=(Button)findViewById(R.id.menos);
			final Button igualar=(Button)findViewById(R.id.igual);
			final Button p=(Button)findViewById(R.id.punto);
			final Button multiplicar=(Button)findViewById(R.id.multi);
			final Button divisor=(Button)findViewById(R.id.dividir);
			final Button iniciar=(Button)findViewById(R.id.ac);
			final Button radical=(Button)findViewById(R.id.radical);
			final Button potencia=(Button)findViewById(R.id.potencia);
			final Button seno=(Button)findViewById(R.id.sen);
			final Button coseno=(Button)findViewById(R.id.cos);
			final Button tangente=(Button)findViewById(R.id.tan);
			final Button shift=(Button)findViewById(R.id.shift);
			
			final TextView totales=(TextView)findViewById(R.id.t);
			final EditText valor=(EditText)findViewById(R.id.valor);
			
			dos.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					total=total+2;
					valor.setText(""+total);
				}	
			});
			
			uno.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+1;
				valor.setText(""+total);
				}	
			});
			
			tres.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+3;
				valor.setText(""+total);
				}
				
			});
			
			cuatro.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+4;
				valor.setText(""+total);
				}	
			});
			cinco.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+5;
				valor.setText(""+total);
				}
			});
			
			seis.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+6;
				valor.setText(""+total);
				}	
			});
			
			
			siete.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+7;
				valor.setText(""+total);
				}	
			});
			
			ocho.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+8;
				valor.setText(""+total);
				}
			});
			
			nueve.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+9;
				valor.setText(""+total);
				}	
			});
			
			cero.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
				total=total+0;
				valor.setText(""+total);
				}
				
			});
			
			p.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
						
						if(shifts==2)
						{
							valor.setText(""+2.718282);
							shifts=1;
						}
						else if(punto==0){
					total=total+".";
					valor.setText(""+total);
					punto=1;
						}
				    } catch(Exception e){}
				}
			});
			
			shift.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					shifts=2;
					//valor.setText(""+3.1416);
				    }  
			});
			
			seno.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
						
						if (shifts==2)
						{
							valor.setText(""+3.1416);
							shifts=1;
						}
						else
						{
				        reciduo2=Math.sin(Math.toRadians(Double.parseDouble(""+valor.getText()))); 
				      signo=6;
				      {

							if(signo==1)
						        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
						    if(signo==2)
						        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
						    if(signo==4)
						        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
						    if(signo==5)
						        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
						    if(signo==6)
						        totales.setText(""+reciduo2);
						        reciduo=0.0;
						        valor.setText(""+reciduo2);
						        reciduo2=0.0;
						        signo=-1;
						        total=""; 
						        punto=0;
				      }
						}
				      }catch(Exception e){}
				    }  	
			});
			
			coseno.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
						if(shifts==2)
						{
							valor.setText(""+(Double.parseDouble(""+valor.getText()))/100);
							shifts=1;
						}
						else
						{
				        reciduo2=Math.cos(Math.toRadians(Double.parseDouble(""+valor.getText()))); 
				      signo=6;
				      {

							if(signo==1)
						        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
						    if(signo==2)
						        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
						    if(signo==4)
						        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
						    if(signo==5)
						        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
						    if(signo==6)
						        totales.setText(""+reciduo2);
						        reciduo=0.0;
						        valor.setText(""+reciduo2);
						        reciduo2=0.0;
						        signo=-1;
						        total=""; 
						        punto=0;
				      }
						}
				      }catch(Exception e){}
				    }  
			});
			
			tangente.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
						if(shifts==2)
						{
							
							double mul=(Double.parseDouble(""+valor.getText()));
							double valorar=1;
							for(;mul>=1;mul--)
							{
								valorar=valorar*mul;	
							}
							
							valor.setText(""+valorar);
						}
						else
						{
				        reciduo2=Math.tan(Math.toRadians(Double.parseDouble(""+valor.getText()))); 
				      signo=6;
				      {

							if(signo==1)
						        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
						    if(signo==2)
						        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
						    if(signo==4)
						        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
						    if(signo==5)
						        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
						    if(signo==6)
						        totales.setText(""+reciduo2);
						        reciduo=0.0;
						        valor.setText(""+reciduo2);
						        reciduo2=0.0;
						        signo=-1;
						        total=""; 
						        punto=0;
				      }
						}
						
						shifts=1;
				      }catch(Exception e){}
				    }  
			});
			
			radical.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
						if(shifts==2)
						{
							valor.setText(""+Math.pow(Double.parseDouble(""+valor.getText()),1.0/3.0));
							shifts=1;
						}
						else{
					    reciduo2=Math.pow(Double.parseDouble(""+valor.getText()),1.0/2.0);
					   signo=6;

						if(signo==1)
					        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
					    if(signo==2)
					        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
					    if(signo==4)
					        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
					    if(signo==5)
					        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
					    if(signo==6)
					        totales.setText(""+reciduo2);
					        reciduo=0.0;
					        valor.setText(""+reciduo2);
					        reciduo2=0.0;
					        signo=-1;
					        total="";
					        punto=0;
						}
					    }catch(Exception e){}
				    }  
			});
			
			potencia.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
						if(shifts==2)
						{
							valor.setText(""+Math.pow(Double.parseDouble(""+valor.getText()),3));
							shifts=1;
						}
						else{
					    reciduo2=Math.pow(Double.parseDouble(""+valor.getText()),2);
					   signo=6;

						if(signo==1)
					        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
					    if(signo==2)
					        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
					    if(signo==4)
					        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
					    if(signo==5)
					        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
					    if(signo==6)
					        totales.setText(""+reciduo2);
					        reciduo=0.0;
					        valor.setText(""+reciduo2);
					        reciduo2=0.0;
					        signo=-1;
					        total="";
					        punto=0;
						}
					    }catch(Exception e){}
				    }  
				
			});
			
			
			iniciar.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					if(shifts==2)
					{
						
					System.exit(0);	
					}
					else{
					valor.setText("");
			        totales.setText("");
			       signo=1;
			         reciduo=0;
			         reciduo2=0;
			         total="";
			         punto=0;
					}
				    }  
			});
			
			divisor.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					try
				    {
				    if(shifts==2)
				    {
				    	valor.setText(""+Math.log(Double.parseDouble(""+valor.getText())));
						shifts=1;
				    }
				    else{
				     if(signo>0)  
				     {
				     }
				    if (reciduo==0)
				    {
				        reciduo=Double.parseDouble(""+valor.getText());
				        reciduo2=reciduo;
				        valor.setText("");
				        signo=5;
				        totales.setText(""+reciduo2);
				        total="";
				        punto=0;
				    }
				    else
				    {
				        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
				        reciduo=0;
				        valor.setText("");
				        signo=5;
				        totales.setText(""+reciduo2);
				        total="";
				        punto=0;
				    }
				    }
				}catch(Exception e){}
				}
				
			});
			
			multiplicar.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
					    
					    	if(shifts==2)
						    {
						    	valor.setText(""+(Double.parseDouble(""+valor.getText()))*Math.random());
								shifts=1;
						    }
					    	else{
					     if(signo>0)  
					     {

								if(signo==1)
							        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
							    if(signo==2)
							        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
							    if(signo==4)
							        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
							    if(signo==5)
							        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
							    if(signo==6)
							        totales.setText(""+reciduo2);
							        reciduo=0.0;
							        valor.setText(""+reciduo2);
							        reciduo2=0.0;
							        signo=-1;
							        total=""; 
							        punto=0;
					     }
					    if (reciduo==0)
					    {
					        reciduo=Double.parseDouble(""+valor.getText());
					        reciduo2=reciduo;
					        valor.setText("");
					        signo=4;
					        totales.setText(""+reciduo2);
					        total="";
					        punto=0;
					    }
					    else
					    {
					        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
					        reciduo=0;
					        valor.setText("");
					        signo=4;
					        totales.setText(""+reciduo2);
					        total="";
					        punto=0;
					    }
					    	}
					    }catch(Exception e){}
					    
				    }  
			});
			
			
			
			atras.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
				        String borrar=total;
				       int a;
				       for( a=0;a<borrar.length();a++)
				       {
				        
				       }
				       String v1=borrar.substring(0,(a-1));
				       total=(""+v1);
				       valor.setText(""+total);
					}catch(Exception e){}
				}
				
			});
			
			suma.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					    try{
					    if(signo>0)  
					    {
					    	
							if(signo==1)
						        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
						    if(signo==2)
						        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
						    if(signo==4)
						        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
						    if(signo==5)
						        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
						    if(signo==6)
						        totales.setText(""+reciduo2);
						        reciduo=0.0;
						        valor.setText(""+reciduo2);
						        reciduo2=0.0;
						        signo=-1;
						        total="";
						        punto=0;
					    }
					    if (reciduo==0)
					    {
					        reciduo=Double.parseDouble(""+valor.getText());
					        reciduo2=reciduo2+reciduo;
					        valor.setText("");
					        signo=1;
					        totales.setText(""+reciduo2);
					        total="";
					        punto=0;
					        
					    }
					    else
					    {
					        reciduo2=reciduo2+Double.parseDouble(""+valor.getText());
					        reciduo=0;
					        valor.setText("");
					        signo=1;
					        totales.setText(""+reciduo2);
					        total="";
					        punto=0;
					    }
					    }catch(Exception e){}
					}
				
			});
			
			igualar.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
					
					if(signo==1)
				        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
				    if(signo==2)
				        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
				    if(signo==4)
				        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
				    if(signo==5)
				        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
				    if(signo==6)
				        totales.setText(""+reciduo2);
				        reciduo=0.0;
				        valor.setText(""+reciduo2);
				        reciduo2=0.0;
				        signo=-1;
				        total="";
				        punto=0;
					}catch(Exception e){}
				}
				
			});	
			
			
			
			menos.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					try{
			        	    if(signo>0)
			        	    {
			        	    	if(signo==1)
			    			        reciduo2=reciduo2+Double.parseDouble(""+valor.getText()); 
			    			    if(signo==2)
			    			        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
			    			    if(signo==4)
			    			        reciduo2=reciduo2*Double.parseDouble(""+valor.getText());
			    			    if(signo==5)
			    			        reciduo2=reciduo2/Double.parseDouble(""+valor.getText());
			    			    if(signo==6)
			    			        totales.setText(""+reciduo2);
			    			        reciduo=0.0;
			    			        valor.setText(""+reciduo2);
			    			        reciduo2=0.0;
			    			        signo=-1;
			    			        total="";
			    			        punto=0;
			    			        
			        	    }
			        	    
			        	     if (reciduo==0)
						    {
						        reciduo=Double.parseDouble(""+valor.getText());
						        reciduo2=reciduo;
						        valor.setText("");
						        signo=2;
						        totales.setText(""+reciduo2);
						        total="";
						        punto=0;
						    }
						    else
						    {
						        reciduo2=reciduo2-Double.parseDouble(""+valor.getText());
						        reciduo=0;
						        valor.setText("");
						        signo=2;
						        totales.setText(""+reciduo2);
						        total="0";
						        punto=0;
						    }
					}catch(Exception e)
					
					{
						if(total.equals("")){
							total=total+"-";
							valor.setText(""+total);  //JOptionPane.showMessageDialog(null,"NO EXISTE VALOR QUE BORRAR");
					      }
						else{
						
						}
					}
				}
			});	
		}
	    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
