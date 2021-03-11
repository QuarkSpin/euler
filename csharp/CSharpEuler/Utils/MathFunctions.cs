using System.Collections.Generic;

namespace CSharpEuler.Utils
{
    public static class MathFunctions
    {
        public static IEnumerable<int> Fibonacci()
        {
            var (a, b) = (0, 1);

            while (true)
            {
                yield return a;
                (a, b) = (b, a + b);
            }
        }
    }
}
