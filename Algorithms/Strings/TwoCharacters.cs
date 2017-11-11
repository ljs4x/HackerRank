using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

class Solution
    {
       
        static void Main(String[] args)
        {

            //build a Set of distinct characters from the input
            //rebuild the string using only two characters from the set
            //check and make sure that two of the same char are not ajacent to each other
            //Then get the length
            //if the length is the longest combination return the length

            int len = Convert.ToInt32(Console.ReadLine());
            string s = Console.ReadLine();

            //string s = "cwomzxmuelmangtosqkgfdqvkzdnxerhravxndvomhbokqmvsfcaddgxgwtpgpqrmeoxvkkjunkbjeyteccpugbkvhljxsshpoymkryydtmfhaogepvbwmypeiqumcibjskmsrpllgbvc";

            HashSet<char> distinctChars = new HashSet<char>();
            int lengthToReturn = 0;
            for(int i = 0; i < s.Length; i++)
            {
                //if the new char IS NOT in the set yet, add it, and check all the pairings
                if (!distinctChars.Contains(s[i]))
                {
                    distinctChars.Add(s[i]);
                    
                    //once we have two characters in the set
                    if (distinctChars.Count() > 1)
                    {
                        char[] charArray = new char[distinctChars.Count];
                        distinctChars.CopyTo(charArray);

                        //iterate on the new pairs 
                        //and see if the new strings are valid, 
                        //and if the length is longest
                        char char2 = s[i];
                        string char2Repeat = "" + char2 + char2;

                        for (int j = 0; j < charArray.Length - 1; j++)
                        {
                            char char1 = charArray[j];
                            string replacementPattern = String.Format(@"([^{0}{1}]+)", char1, char2);
                            string replaceWith = "";
                            
                            string stringReplaced = Regex.Replace(s, replacementPattern, replaceWith);
                            string char1Repeat = "" + char1 + char1;

                            //if the characters are ever repeated break out, it's a bad string
                            if(!stringReplaced.Contains(char2Repeat) && !stringReplaced.Contains(char1Repeat))
                            {
                                //if the length is longest save the length
                                if (stringReplaced.Length > lengthToReturn)
                                {
                                    lengthToReturn = stringReplaced.Length;
                                }
                            }

                            //Console.Write(stringReplaced);
                            //Console.ReadLine();

                            

                        }
                    }

                }

                else
                {
                    // go to next string character loop iteration
                }

                
                
            }

            Console.WriteLine(lengthToReturn);
            //Console.ReadLine();
            
        }
    }


